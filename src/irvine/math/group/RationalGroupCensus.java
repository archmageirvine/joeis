package irvine.math.group;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Counts maximal irreducible finite rational matrix groups from structural
 * catalogue records, by checking the possible proper containments.
 * @author Gregory Morse
 */
public final class RationalGroupCensus {

  private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
  private static final Z SMALL = Z.valueOf(2048);
  private static final int[] LATTICE_PRIMES = {2, 3, 5, 7, 11, 13};
  private static final int SAMPLES = 192;
  private static final long TORUS_LIMIT = 600000;

  private Map<String, String> mRecords;
  private final Map<String, List<Q>> mSeeds = new HashMap<>();
  private final Map<String, String> mTypes = new HashMap<>();
  private final Map<String, Map<Integer, SylowInput>> mSylows = new HashMap<>();
  private final Map<String, ClassInput> mClassInputs = new HashMap<>();
  private final Map<String, Map<Integer, List<ClassInput>>> mNormalizers = new HashMap<>();
  private final Map<String, LocalClassInput> mLocalInputs = new HashMap<>();
  private final Map<String, BlockQuotientInput> mBlockQuotients = new HashMap<>();
  private final Map<Integer, TorusInput> mTori = new HashMap<>();
  private Map<Integer, String> mRows;
  private RationalBlockSpectra.SpectrumTable mLeech;
  private RationalBlockSpectra.SpectrumTable mE8;
  private Q[][][] mG2Normalizer;
  private List<Q> mG2Seed;
  private LocalClassInput mG2LocalRestriction;

  static InputStream resource(final String name) throws IOException {
    final InputStream in = RationalGroupCensus.class.getResourceAsStream("resources/" + name);
    if (in == null) {
      throw new IOException("Missing rational group resource " + name);
    }
    return in;
  }

  private static Map<String, String> readRecords() throws IOException {
    final String data;
    try (InputStream in = resource("a069481-imf.dat.gz");
         InputStream decoded = new GZIPInputStream(in)) {
      data = new String(decoded.readAllBytes(), StandardCharsets.UTF_8);
    }
    final Map<String, String> records = new HashMap<>();
    final Matcher sections = Pattern.compile("(?m)^@@ ([A-Za-z0-9]+[.]txt)\\n").matcher(data);
    int start = 0;
    String name = null;
    while (sections.find()) {
      if (name != null && records.putIfAbsent(name, data.substring(start, sections.start())) != null) {
        throw new IOException("Duplicate rational group record " + name);
      }
      name = sections.group(1);
      start = sections.end();
    }
    if (name == null || records.putIfAbsent(name, data.substring(start)) != null) {
      throw new IOException("Invalid rational group resource");
    }
    return records;
  }

  private String record(final String name) throws IOException {
    if (mRecords == null) {
      mRecords = readRecords();
    }
    final String data = mRecords.get(name);
    if (data == null) {
      throw new IOException("Missing rational group record " + name);
    }
    return data;
  }

  /**
   * Count maximal rational classes in the given dimension.
   * @param n dimension
   * @return the exact count
   * @throws IOException if structural data are missing
   */
  public int maximal(final int n) throws IOException {
    if (n < 1 || n > 31) {
      throw new UnsupportedOperationException("Rational matrix-group catalogue covers dimensions 1 to 31");
    }
    if (n <= 6) {
      return RationalGroupCatalogue.maximal(n);
    }
    if (n == 7) {
      return RationalE7Census.maximal(record("ImfNative7Structure.txt"));
    }
    if (mRows == null) {
      loadImf();
    }
    final List<Candidate> candidates = read(mRows.get(n));
    for (final Candidate c : candidates) {
      final String id = n + "." + c.mIndex;
      c.mSeed = mSeeds.get(id);
      c.mType = mTypes.getOrDefault(id, "");
      c.mSylowInputs.putAll(mSylows.getOrDefault(id, Map.of()));
      c.mClassInput = mClassInputs.get(id);
      c.mNormalizers = mNormalizers.getOrDefault(id, Map.of());
      c.mLocalClassInput = mLocalInputs.get(id);
      c.mLocalPerfectInput = mLocalInputs.get(n + "." + (2000 + c.mIndex));
      c.mBlockQuotient = mBlockQuotients.get(id);
      if (n == 16) {
        c.mTorus = mTori.get(c.mIndex);
      }
    }
    return count(n, candidates);
  }

  private static final Pattern SIMPLEX_FACTOR = Pattern.compile("W\\(A([0-9]+)\\)|S([0-9]+)");

  private static final class SylowInput {
    private final List<Q> mSeed;
    private final Q[][][] mGenerators;

    private SylowInput(final List<Q> seed, final Q[][][] generators) {
      mSeed = seed;
      mGenerators = generators;
    }
  }

  private static final class TorusInput {
    private List<Q> mSeed;
    private Q[][] mElement;
    private final List<Q[][]> mRadical = new ArrayList<>();
    private final List<RationalIndexTwoSpectra.QuotientClass> mClasses = new ArrayList<>();
  }

  private static final class ClassInput {
    private final Z mOrder;
    private final int mRadicalOrder;
    private final List<Q[][]> mGenerators;
    private final List<RationalClassInventory.Lift> mClasses;

    private ClassInput(final Z order, final int radicalOrder, final List<Q[][]> generators, final List<RationalClassInventory.Lift> classes) {
      mOrder = order;
      mRadicalOrder = radicalOrder;
      mGenerators = generators;
      mClasses = classes;
    }
  }

  private static final class LocalClassInput {
    private final Z mOrder;
    private Q[][] mBasis;
    private final Map<List<Integer>, Z> mCounts = new HashMap<>();
    private final List<Q[][]> mLifts = new ArrayList<>();

    private LocalClassInput(final Z order) {
      mOrder = order;
    }
  }

  private static final class BlockQuotientInput {
    private final Z mOrder;
    private final Z mPerfectOrder;
    private int[][] mGraph;
    private Z mMass = Z.ZERO;
    private final List<Integer> mLocations = new ArrayList<>();
    private final List<int[]> mTraces = new ArrayList<>();
    private final List<Q[][]> mLifts = new ArrayList<>();

    private BlockQuotientInput(final Z order, final Z perfectOrder) {
      mOrder = order;
      mPerfectOrder = perfectOrder;
    }
  }

  private static final class Candidate {
    private final RationalGroupCensus mCensus;
    private final int mIndex;
    private final Z mOrder;
    private final Q[][][] mGenerators;
    private final Q[][] mGram;
    private boolean mChecked;
    private RationalInvariantForms mForm;
    private RationalGroupContainment.Target mSmallGroup;
    private Boolean mSignedObstruction;
    private Boolean mDeletedObstruction;
    private Boolean mSimplexModel;
    private Boolean mFullSimplex;
    private Boolean mSignedFrame;
    private List<Q> mSeed;
    private String mType = "";
    private Optional<RationalIndexTwoSpectra.Census> mSpectrum;
    private Optional<RationalIndexTwoSpectra.Census> mStreamSpectrum;
    private ClassInput mClassInput;
    private Map<Integer, List<ClassInput>> mNormalizers = Map.of();
    private RationalBlockSpectra.SpectrumTable mClassSpectrum;
    private LocalClassInput mLocalClassInput;
    private LocalClassInput mLocalPerfectInput;
    private BlockQuotientInput mBlockQuotient;
    private boolean mBlockQuotientChecked;
    private RationalBlockSpectra.SpectrumTable mLocalClassSpectrum;
    private RationalBlockSpectra.LocalHull mLocalClassHull;
    private boolean mFullWreath;
    private RationalBlockSpectra.SpectrumTable mG2RestrictionSpectrum;
    private final Map<Integer, SylowInput> mSylowInputs = new HashMap<>();
    private final Map<Integer, Optional<RationalIndexTwoSpectra.Census>> mSylowSpectra = new HashMap<>();
    private final Map<Integer, Optional<Set<List<Integer>>>> mProfiles = new HashMap<>();
    private final Map<Integer, List<Integer>> mDivisors = new HashMap<>();
    private int mBlock = -1;
    private RationalBlockModels.Model mBlockModel;
    private RationalGroupCommutant mCommutant;
    private List<int[]> mWordSpectra;
    private Boolean mDerivedScalar;
    private Optional<RationalBlockSpectra.LocalHull> mLocalHull;
    private Optional<RationalBlockSpectra.LocalHull> mAlignedHull;
    private Boolean mLeechLattice;
    private TorusInput mTorus;
    private Optional<Z> mTorusMass;
    private boolean mG2NormalizerChecked;
    private Optional<Set<String>> mTensorSpectrum;
    private final Map<Integer, Boolean> mBlockObstruction = new HashMap<>();
    private Optional<Set<PrimeLatticeProfiles.Fingerprint>> mGlobalProfiles;
    private Optional<List<Z[][]>> mGlobalModels;
    private Z[][] mPrimitive;
    private PrimeLatticeProfiles.Fingerprint mFingerprint;

    private Optional<List<Z[][]>> globalModels() {
      if (mGlobalModels == null) {
        Z q = mOrder;
        final List<Integer> primes = new ArrayList<>();
        for (final int p : PRIMES) {
          if (q.mod(p) == 0) {
            primes.add(p);
            do {
              q = q.divide(p);
            } while (q.mod(p) == 0);
          }
        }
        final int[] used = primes.stream().mapToInt(Integer::intValue).toArray();
        if (!q.isOne()) {
          mGlobalModels = Optional.empty();
        } else if (mGram.length == 24 && mOrder.equals(Z.valueOf(30240)) && mType.equals("C6.A7:C2")) {
          final Q[][] field = commutant().quadraticGenerator(-6);
          mGlobalModels = PrimeLatticeProfiles.minusSixModels(mGenerators, mGram, field, used, 128, 420000000);
        } else {
          final long budget = mGram.length == 24 && mType.equals("(C3.M10 x SL(2,3)).C2") ? 95000000 : 15000000;
          mGlobalModels = PrimeLatticeProfiles.models(mGenerators, mGram, used, 48, budget);
        }
      }
      return mGlobalModels;
    }

    private int block() {
      if (mBlock < 0) {
        mBlock = RationalBlockSpectra.coordinateBlock(mGenerators, mGram);
        if (mBlock == 0) {
          mBlockModel = RationalBlockModels.orbit(mGenerators, mGram, mSeed).orElse(null);
          if (mBlockModel != null) {
            mBlock = mBlockModel.rank();
          }
        }
      }
      return mBlock;
    }

    private Q[][][] blockGenerators() {
      return mBlockModel == null ? mGenerators : mBlockModel.generators();
    }

    private Q[][] blockForm() {
      return mBlockModel == null ? mGram : mBlockModel.form();
    }

    private RationalGroupCommutant commutant() {
      if (mCommutant == null) {
        mCommutant = RationalGroupCommutant.of(mGenerators);
      }
      return mCommutant;
    }

    private boolean blockObstruction(final int d) {
      return mBlockObstruction.computeIfAbsent(d, k -> findWordWitness(a -> !RationalBlockSpectra.canPermuteBlocks(traces(a, a.length), k))
        || SAMPLES > 0 && wordSpectra().stream().anyMatch(t -> !RationalBlockSpectra.canPermuteBlocks(t, k)));
    }

    private List<int[]> wordSpectra() {
      if (mWordSpectra == null) {
        mWordSpectra = RationalBlockSpectra.sampleSpectra(mGenerators, SAMPLES);
      }
      return mWordSpectra;
    }

    private boolean localHullObstruction(final Candidate source) {
      if (mLocalHull == null) {
        mLocalHull = RationalBlockSpectra.localHull(blockGenerators(), blockForm());
      }
      return mLocalHull.isPresent() && source.wordSpectra().stream().anyMatch(t -> !mLocalHull.orElseThrow().fits(t));
    }

    private boolean alignedBlockObstruction(final Candidate source) {
      final int rank = block();
      if (rank <= 0 || rank > 15) {
        return false;
      }
      if (mAlignedHull == null) {
        final int count = mGram.length / rank;
        // An even unimodular positive integral lattice of rank 8 is E8.
        if (mCensus.mE8 != null && rank == 8 && RationalBlockSpectra.hasEvenUnimodularBlocks(blockGenerators(), blockForm(), 8)) {
          mAlignedHull = Optional.of(mCensus.mE8.hull(count));
        } else {
          mAlignedHull = mType.contains("W(A" + rank + ")") || mType.startsWith("(C2 x S" + (rank + 1) + ") wr")
            ? RationalBlockSpectra.simplexHull(blockGenerators(), blockForm()) : Optional.empty();
          if (mAlignedHull.isEmpty()) {
            final Z base = mOrder.divide2().sqrt();
            final boolean smallWreath = mOrder.equals(base.square().multiply(2)) && base.compareTo(Z.valueOf(85000)) <= 0
              || rank == 6 && mType.contains("W(E6)") && mType.contains(" wr ");
            if (smallWreath || rank <= 8 && count == 2) {
              mAlignedHull = RationalBlockSpectra.localHull(blockGenerators(), blockForm(), 15, smallWreath ? 108000 : 32768);
            }
          }
        }
      }
      if (mAlignedHull.isEmpty()) {
        return false;
      }
      final RationalBlockSpectra.LocalHull hull = mAlignedHull.orElseThrow();
      if (source.wordSpectra().stream().anyMatch(t -> !hull.fits(t))) {
        return true;
      }
      return rank * 2 == mGram.length && source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0
        && source.spectrum().isPresent() && source.spectrum().orElseThrow().excludesTwoBlockAction(hull);
    }

    private boolean derivedHasScalarCommutant() {
      if (mDerivedScalar == null) {
        mDerivedScalar = false;
        for (final int prime : new int[] {103, 101, 107}) {
          final Z modulus = Z.valueOf(prime);
          final int[][][] reduced = new int[mGenerators.length][][];
          for (int i = 0; i < mGenerators.length; ++i) {
            final Q[][] g = mGenerators[i];
            reduced[i] = new int[g.length][g.length];
            for (int j = 0; j < g.length; ++j) {
              for (int k = 0; k < g.length; ++k) {
                if (!g[j][k].isInteger()) {
                  return false;
                }
                reduced[i][j][k] = g[j][k].toZ().mod(modulus).intValueExact();
              }
            }
          }
          if (ModularInvariantSubspaces.derivedHasScalarCommutant(reduced, prime, 90000000)) {
            mDerivedScalar = true;
            break;
          }
        }
      }
      return mDerivedScalar;
    }

    private boolean globalObstruction(final Candidate target) {
      if (mGlobalProfiles == null) {
        mGlobalProfiles = globalModels().map(models -> {
          final Set<PrimeLatticeProfiles.Fingerprint> result = new java.util.HashSet<>();
          for (final Z[][] model : models) {
            result.add(PrimeLatticeProfiles.fingerprint(model));
          }
          return result;
        });
      }
      if (mGlobalProfiles.isEmpty()) {
        return false;
      }
      if (target.mFingerprint == null) {
        target.mFingerprint = PrimeLatticeProfiles.fingerprint(target.mGram);
      }
      return !mGlobalProfiles.orElseThrow().contains(target.mFingerprint);
    }

    private Z[][] primitive() {
      if (mPrimitive == null) {
        mPrimitive = PrimeLatticeProfiles.primitive(mGram);
      }
      return mPrimitive;
    }

    private Optional<Boolean> isometry(final Candidate target) {
      final Optional<List<Z[][]>> models = globalModels();
      boolean complete = models.isPresent();
      final List<Z[][]> candidates = models.orElseGet(() -> java.util.Collections.singletonList(primitive()));
      for (final Z[][] model : candidates) {
        final Optional<Boolean> reaches = RationalLatticeIsometry.matches(model, target.primitive(),
          mGram.length <= 16 ? 50000 : 16000, 3000000);
        if (reaches.orElse(false)) {
          return reaches;
        }
        complete &= reaches.isPresent();
      }
      return complete ? Optional.of(false) : Optional.empty();
    }

    private Candidate(final RationalGroupCensus census, final int index, final Z order, final Q[][][] generators, final Q[][] gram) {
      mCensus = census;
      mIndex = index;
      mOrder = order;
      mGenerators = generators;
      mGram = gram;
    }

    private List<Integer> divisors(final int prime) {
      return mDivisors.computeIfAbsent(prime, p -> PrimeLatticeProfiles.elementaryDivisors(mGram, p));
    }

    private int localObstruction(final Candidate target) {
      for (final int prime : LATTICE_PRIMES) {
        final List<Integer> expected = target.divisors(prime);
        if (!divisors(prime).equals(expected)) {
          final Optional<Set<List<Integer>>> profiles = mProfiles.computeIfAbsent(prime,
            p -> PrimeLatticeProfiles.profiles(mGenerators, mGram, p, 48, 15000000));
          if (profiles.isPresent() && !profiles.orElseThrow().contains(expected)) {
            return prime;
          }
        }
      }
      return 0;
    }

    private RationalInvariantForms form() {
      if (!mChecked) {
        mForm = RationalGroupForms.certify(mGram, mGenerators, PRIMES).orElse(null);
        mChecked = true;
      }
      return mForm;
    }

    private Optional<RationalIndexTwoSpectra.Census> spectrum() {
      if (mSpectrum == null) {
        mSpectrum = RationalIndexTwoSpectra.census(mGenerators, mSeed, mOrder.intValueExact());
      }
      return mSpectrum;
    }

    private Optional<RationalBlockSpectra.SpectrumTable> classSpectrum() {
      if (mClassInput == null) {
        return Optional.empty();
      }
      if (mClassSpectrum == null) {
        if (!mOrder.equals(mClassInput.mOrder)) {
          throw new IllegalArgumentException("Class inventory does not match the ambient group order");
        }
        mClassSpectrum = RationalClassInventory.evaluate(mGram, mGenerators, mOrder, mClassInput.mRadicalOrder,
          mClassInput.mGenerators.toArray(new Q[0][][]), mClassInput.mClasses);
      }
      return Optional.of(mClassSpectrum);
    }

    private boolean classObstruction(final Candidate source) {
      final List<ClassInput> normalizers = mNormalizers.getOrDefault(source.mIndex, List.of());
      if (!normalizers.isEmpty() && source.classSpectrum().isPresent()) {
        boolean all = true;
        for (final ClassInput group : normalizers) {
          if (group.mOrder.mod(source.mOrder).isZero()) {
            final RationalBlockSpectra.SpectrumTable table = RationalClassInventory.evaluate(mGram, mGenerators, group.mOrder, 1,
              new Q[0][][], group.mClasses);
            if (!source.mClassSpectrum.exceeds(table)) {
              all = false;
              break;
            }
          }
        }
        if (all) {
          return true;
        }
      }
      if (localClassSpectrum().isPresent() && (source.localClassSpectrum().isPresent() && source.mFullWreath
          && source.mLocalClassSpectrum.hasSingleBlockOutside(mLocalClassHull, mGram.length, source.mLocalClassInput.mBasis.length)
        || completeHullObstruction(source, mLocalClassHull, mGram.length / mLocalClassInput.mBasis.length))
        || mAlignedHull != null && mAlignedHull.isPresent() && completeHullObstruction(source, mAlignedHull.orElseThrow(), mGram.length / block())
        || mLocalHull != null && mLocalHull.isPresent() && completeHullObstruction(source, mLocalHull.orElseThrow(), mGram.length / block())) {
        return true;
      }
      final Optional<RationalBlockSpectra.SpectrumTable> target = classSpectrum();
      if (target.isEmpty()) {
        return false;
      }
      final RationalBlockSpectra.SpectrumTable table = target.orElseThrow();
      return source.wordSpectra().stream().anyMatch(t -> !table.contains(t))
        || source.classSpectrum().isPresent() && source.mClassSpectrum.exceeds(table)
        || source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0
          && source.spectrum().isPresent() && source.spectrum().orElseThrow().exceeds(table);
    }

    private boolean completeHullObstruction(final Candidate source, final RationalBlockSpectra.LocalHull hull, final int blocks) {
      final Predicate<int[]> outside = t -> !hull.fits(t);
      if (source.wordSpectra().stream().anyMatch(outside)
        || source.classSpectrum().isPresent() && source.mClassSpectrum.hasSpectrum(mGram.length, 0, outside)) {
        return true;
      }
      if (blocks <= 3 && source.mBlockQuotient != null && source.quotientExcludes(hull, blocks)) {
        return true;
      }
      return source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0
        && source.spectrum().isPresent()
        && (source.spectrum().orElseThrow().hasSpectrum(outside)
          || blocks == 2 && source.spectrum().orElseThrow().excludesTwoBlockAction(hull));
    }

    private boolean quotientExcludes(final RationalBlockSpectra.LocalHull hull, final int blocks) {
      final BlockQuotientInput q = mBlockQuotient;
      if (!mBlockQuotientChecked) {
        if (!mOrder.equals(q.mOrder) || !mOrder.equals(q.mMass)
          || q.mGraph == null || !mOrder.equals(q.mPerfectOrder.multiply(q.mGraph.length))) {
          throw new IllegalArgumentException("Incomplete quotient inventory");
        }
        for (int j = 0; j < q.mGraph[0].length; ++j) {
          final boolean[] images = new boolean[q.mGraph.length];
          for (final int[] row : q.mGraph) {
            final int image = row[j];
            if (image < 0 || image >= images.length || images[image]) {
              throw new IllegalArgumentException("A quotient generator does not give a permutation");
            }
            images[image] = true;
          }
        }
        RationalGroupForms.checkInvariant(mGram, q.mLifts.toArray(new Q[0][][]));
        mBlockQuotientChecked = true;
      }
      return RationalBlockQuotients.excludes(q.mGraph, blocks, q.mLocations.stream().mapToInt(Integer::intValue).toArray(), q.mTraces, hull);
    }

    private static Q dot(final Q[] left, final Q[] right) {
      Q sum = Q.ZERO;
      for (int j = 0; j < left.length; ++j) {
        sum = sum.add(left[j].multiply(right[j]));
      }
      return sum;
    }

    private Optional<RationalBlockSpectra.SpectrumTable> localClassSpectrum() {
      if (mLocalClassInput == null) {
        return Optional.empty();
      }
      if (mLocalClassSpectrum == null) {
        final Q[][] first = mLocalClassInput.mBasis;
        final int rank = first.length;
        final int n = mGram.length;
        if (rank < 1 || rank == n || n % rank != 0) {
          throw new IllegalArgumentException("Invalid block rank");
        }
        final int count = n / rank;
        final List<Q[][]> blocks = new ArrayList<>();
        final List<Q[][]> duals = new ArrayList<>();
        blocks.add(first);
        duals.add(Arrays.stream(first).map(v -> RationalBlockModels.action(v, mGram)).toArray(Q[][]::new));
        for (int i = 0; i < blocks.size(); ++i) {
          for (final Q[][] g : mGenerators) {
            final Q[][] image = Arrays.stream(blocks.get(i)).map(v -> RationalBlockModels.action(v, g)).toArray(Q[][]::new);
            boolean seen = false;
            for (int b = 0; b < blocks.size(); ++b) {
              final Q[][] dual = duals.get(b);
              if (Arrays.stream(image).anyMatch(v -> Arrays.stream(dual).anyMatch(u -> dot(v, u).signum() != 0))) {
                final Q[][] span = new Q[n][];
                for (final Q[] v : blocks.get(b)) {
                  if (!RationalBlockModels.insert(span, v)) {
                    throw new IllegalArgumentException("Dependent block basis");
                  }
                }
                for (final Q[] v : image) {
                  if (RationalBlockModels.insert(span, v)) {
                    throw new IllegalArgumentException("Block image is neither equal nor orthogonal");
                  }
                }
                seen = true;
                break;
              }
            }
            if (!seen) {
              if (blocks.size() == count) {
                throw new IllegalArgumentException("Too many orthogonal blocks");
              }
              blocks.add(image);
              duals.add(Arrays.stream(image).map(v -> RationalBlockModels.action(v, mGram)).toArray(Q[][]::new));
            }
          }
        }
        if (blocks.size() != count) {
          throw new IllegalArgumentException("Block conjugates do not span the whole module");
        }
        final Q[][] form = new Q[rank][rank];
        for (int i = 0; i < rank; ++i) {
          final Q[] u = RationalBlockModels.action(first[i], mGram);
          for (int j = 0; j < rank; ++j) {
            form[i][j] = dot(u, first[j]);
          }
        }
        RationalGroupForms.checkInvariant(form, mLocalClassInput.mLifts.toArray(new Q[0][][]));
        mLocalClassSpectrum = new RationalBlockSpectra.SpectrumTable(rank, mLocalClassInput.mOrder, mLocalClassInput.mCounts);
        mLocalClassHull = mLocalClassSpectrum.hull(count);
        mFullWreath = mOrder.equals(mLocalClassInput.mOrder.pow(count).multiply(factorial(count)));
      }
      return Optional.of(mLocalClassSpectrum);
    }

    private boolean indexObstruction(final Candidate source) {
      if (mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.STREAM_LIMIT)) > 0) {
        return false;
      }
      final Optional<RationalIndexTwoSpectra.Census> a = source.spectrum();
      if (a.isEmpty()) {
        return false;
      }
      final Optional<RationalIndexTwoSpectra.Census> b;
      if (mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0) {
        b = spectrum();
      } else {
        if (mStreamSpectrum == null) {
          final SylowInput suppliedSeed = mSylowInputs.values().stream().findFirst().orElse(null);
          mStreamSpectrum = RationalIndexTwoSpectra.streamed(mGenerators, suppliedSeed == null ? mSeed : suppliedSeed.mSeed, mOrder.intValueExact());
        }
        b = mStreamSpectrum;
      }
      final boolean indexTwo = mOrder.equals(source.mOrder.shiftLeft(1));
      return a.isPresent() && b.isPresent() && (b.orElseThrow().excludes(a.orElseThrow(), indexTwo)
        || indexTwo && RationalIndexTwoSpectra.markedExclusion(source.mGenerators, source.mSeed, mGenerators, mSeed, source.mOrder.intValueExact()));
    }

    private Optional<RationalIndexTwoSpectra.Census> sylow(final int p) {
      return mSylowSpectra.computeIfAbsent(p, prime -> {
        final SylowInput supplied = mSylowInputs.get(prime);
        return supplied == null ? Optional.empty() : RationalIndexTwoSpectra.sylow(mGenerators, supplied.mSeed, supplied.mGenerators, mOrder, prime);
      });
    }

    private boolean sylowObstruction(final Candidate source) {
      for (final int p : mSylowInputs.keySet()) {
        if (source.mSylowInputs.containsKey(p)) {
          final Optional<RationalIndexTwoSpectra.Census> a = source.sylow(p);
          final Optional<RationalIndexTwoSpectra.Census> b = sylow(p);
          if (a.isPresent() && b.isPresent() && b.orElseThrow().excludes(a.orElseThrow(), false)) {
            return true;
          }
        }
      }
      return false;
    }

    private boolean torusObstruction(final Candidate source) {
      final SylowInput hint = mSylowInputs.get(5);
      return hint != null && mOrder.compareTo(Z.valueOf(TORUS_LIMIT)) <= 0
        && source.mGram.length == 16 && source.mOrder.equals(Z.valueOf(240))
        && RationalIndexTwoSpectra.excludesNormalCyclic(source.mGenerators, source.mSeed, 240,
          mGenerators, hint.mSeed, mOrder, hint.mGenerators, 60, 5);
    }

    private Optional<Z> torusMass() {
      if (mTorusMass == null) {
        final int[] signature = traces(mTorus.mElement, mGram.length);
        if (mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.STREAM_LIMIT)) <= 0) {
          if (mStreamSpectrum == null) {
            mStreamSpectrum = RationalIndexTwoSpectra.streamed(mGenerators, mTorus.mSeed, mOrder.intValueExact());
          }
          mTorusMass = mStreamSpectrum.map(s -> Z.valueOf(s.frequency(signature)));
        } else if (mCensus.mE8 != null && mOrder.equals(Z.valueOf(4180377600L))
          && RationalLatticeIsometry.matches(primitive(), RationalBlockSpectra.e8TensorA2(), 50000, 10000000).orElse(false)) {
          mTorusMass = Optional.of(mCensus.mE8.symmetricTensorTwoMass(signature));
        } else {
          mTorusMass = Optional.empty();
        }
      }
      return mTorusMass;
    }

    private boolean coveredCyclicObstruction(final Candidate source) {
      if (mTorus == null || source.mGram.length != 16 || !source.mOrder.equals(Z.valueOf(240))) {
        return false;
      }
      final boolean fibres = !mTorus.mClasses.isEmpty();
      final Optional<Z> mass = fibres ? Optional.empty() : torusMass();
      if (!fibres && mass.isEmpty()) {
        return false;
      }
      return RationalIndexTwoSpectra.excludesCoveredCyclic(source.mGenerators, source.mSeed, 240,
        mGenerators, mTorus.mSeed, mOrder, mTorus.mElement, 60, mass.orElse(null),
        mTorus.mRadical.toArray(new Q[0][][]), 512, mTorus.mClasses);
    }

    private boolean algebraicSpectralObstruction(final Candidate source) {
      final boolean tensor = mType.equals("W(E8) x W(A2)") && mOrder.equals(Z.valueOf(4180377600L))
        || mType.startsWith("C2 x S3 x ") || mType.startsWith("C2 x W(A2) x ");
      final boolean alternatingCover = mType.matches("C2\\.A[0-9]+");
      if (!tensor && !alternatingCover) {
        return false;
      }
      final Predicate<int[]> isWitness = traces -> tensor && !RationalBlockSpectra.fitsSymmetricTensorTwo(traces)
        || alternatingCover && StructuralPermutationObstructions.excludesAlternatingCoverOrder(
          mType, mOrder, RationalBlockSpectra.elementOrder(traces));
      if (source.wordSpectra().stream().anyMatch(isWitness)) {
        return true;
      }
      if (source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0) {
        return source.spectrum().isPresent() && source.spectrum().orElseThrow().hasSpectrum(isWitness);
      }
      if (source.mGram.length == 16 && source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.STREAM_LIMIT)) <= 0) {
        if (source.mStreamSpectrum == null) {
          source.mStreamSpectrum = RationalIndexTwoSpectra.streamed(source.mGenerators, source.mSeed, source.mOrder.intValueExact());
        }
        return source.mStreamSpectrum.isPresent() && source.mStreamSpectrum.orElseThrow().hasSpectrum(isWitness);
      }
      return false;
    }

    private static int simplexRank(final String factor) {
      final Matcher m = SIMPLEX_FACTOR.matcher(factor);
      if (!m.matches()) {
        return 0;
      }
      return m.group(1) == null ? Integer.parseInt(m.group(2)) - 1 : Integer.parseInt(m.group(1));
    }

    private static Z factorial(final int n) {
      Z product = Z.ONE;
      for (int i = 2; i <= n; ++i) {
        product = product.multiply(i);
      }
      return product;
    }

    // For these small factors, verify the low-degree character classification
    // directly by the hook formula, including the exceptional degree for S6.
    private static boolean onlyNaturalAtMinimum(final int letters) {
      return letters >= 3 && letters <= 32
        && onlyNaturalAtMinimum(letters, letters, letters, new ArrayList<>(), factorial(letters));
    }

    private static boolean onlyNaturalAtMinimum(final int letters, final int left, final int max, final List<Integer> shape, final Z order) {
      if (left == 0) {
        if (shape.size() == 1 || shape.size() == letters
          || shape.size() == 2 && shape.get(0) == letters - 1
          || shape.size() == letters - 1 && shape.get(0) == 2) {
          return true;
        }
        Z hooks = Z.ONE;
        for (int i = 0; i < shape.size(); ++i) {
          for (int j = 0; j < shape.get(i); ++j) {
            int hook = shape.get(i) - j;
            for (int k = i + 1; k < shape.size() && shape.get(k) > j; ++k) {
              ++hook;
            }
            hooks = hooks.multiply(hook);
          }
        }
        return order.divide(hooks).compareTo(Z.valueOf(letters - 1)) > 0;
      }
      for (int part = Math.min(left, max); part >= 1; --part) {
        shape.add(part);
        final boolean valid = onlyNaturalAtMinimum(letters, left - part, part, shape, order);
        shape.remove(shape.size() - 1);
        if (!valid) {
          return false;
        }
      }
      return true;
    }

    private Optional<Set<String>> tensorSpectrum() {
      if (mTensorSpectrum == null) {
        mTensorSpectrum = Optional.empty();
        final String[] factors = mType.split(" = ", 2)[0].split(" x ");
        if (factors.length == 3 && "C2".equals(factors[0])) {
          final int a = simplexRank(factors[1]);
          final int b = simplexRank(factors[2]);
          if (a >= 2 && b >= 2 && a * b == mGram.length && mOrder.equals(factorial(a + 1).multiply(factorial(b + 1)).multiply(2))
            && (onlyNaturalAtMinimum(a + 1) && onlyNaturalAtMinimum(b + 1) || RationalLatticeIsometry.matches(primitive(),
              RationalBlockSpectra.tensorGram(RationalBlockSpectra.simplexGram(a), RationalBlockSpectra.simplexGram(b)), 35000, 4000000)
              .orElse(false))) {
            // The minimum-degree irreducible faithful factors are the
            // natural modules up to sign. Both signs are already present.
            // Alternatively the exact lattice identifies the group.
            mTensorSpectrum = Optional.of(RationalBlockSpectra.signedSimplexTensor(a, b));
          }
        }
      }
      return mTensorSpectrum;
    }

    private boolean tensorObstruction(final Candidate source) {
      if (tensorSpectrum().isEmpty()) {
        return false;
      }
      final Predicate<int[]> missing = t -> !mTensorSpectrum.orElseThrow().contains(Arrays.toString(t));
      return source.wordSpectra().stream().anyMatch(missing)
        || source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0
          && source.spectrum().isPresent() && source.spectrum().orElseThrow().hasSpectrum(missing);
    }

    private boolean easySectionObstruction(final Candidate source) {
      final int n = mGram.length;
      final String from = source.mType.split(" = ", 2)[0];
      final String to = mType.split(" = ", 2)[0];
      if (n == 24 && "C6.A7:C2".equals(from) && source.mOrder.equals(Z.valueOf(30240))
        && ("C2.Co1".equals(to) && mOrder.equals(new Z("8315553613086720000"))
          || "(C6 x PSU(4,3).C2 Y SL(2,3)).C2".equals(to) && mOrder.equals(Z.valueOf(940584960)))) {
        // A checked skew generator of the full quadratic commutant
        // forces invariant symmetric forms to be scalar multiples.
        final Optional<List<Z[][]>> forms = source.globalModels();
        return forms.isPresent() && forms.orElseThrow().stream().allMatch(model ->
          !PrimeLatticeProfiles.fingerprint(model).equals(PrimeLatticeProfiles.fingerprint(primitive()))
            || RationalLatticeIsometry.excludesMinimumNeighborhood(model, primitive(), 60000, 240000000)
            || RationalLatticeIsometry.matches(model, primitive(), 25000, 15000000).filter(x -> !x).isPresent());
      }
      if (n == 24 && "(C2 x D78).C12".equals(from) && source.mOrder.equals(Z.valueOf(1872))
        && "C2 x S3 x S13".equals(to) && mOrder.equals(factorial(13).multiply(12))) {
        // The characteristic C13 in the normal C2 x D78 must
        // project to a 13-cycle. Its normalizer has the same order
        // as the source and is C2 x S3 x AGL(1,13), whose derived
        // group has order 3*13. Compute the source's derived order
        // from its actual generators; a larger one excludes equality.
        return RationalIndexTwoSpectra.exceedsDerivedOrder(source.mGenerators, source.mSeed, 1872, 39);
      }
      if (n == 24 && "(C2.J2 Y SL(2,5)):C2".equals(to) && mOrder.equals(Z.valueOf(145152000))) {
        if ("(C6.PSL(3,4).C2 Y D8).C2".equals(from) && source.mOrder.equals(Z.valueOf(1935360))) {
          // No maximal subgroup of J2 is large enough for L3(4);
          // the other simple factor is just A5.
          return true;
        }
        if (source.mOrder.equals(Z.valueOf(1728000))
          && ("(((SL(2,5) Y SL(2,5)):C2) x A5):C2".equals(from)
            || "(((SL(2,5) Y SL(2,5)):C2) x A5).C2".equals(from))) {
          // The three commuting perfect A5 sections must survive.
          // J2 cannot contain A5 x A5 by its maximal subgroup
          // orders, and the other direct factor is only A5.
          return true;
        }
        if ("((SL(2,3) Y C4).C2 x PSU(3,3)).C2".equals(from) && source.mOrder.equals(Z.valueOf(1161216))) {
          // U3(3) is the sole maximal host of order divisible by its
          // own order in J2, so its centralizer there is trivial.
          // The lifted centralizer has order dividing 2*120 and
          // cannot carry the commuting order-96 factor.
          return true;
        }
        if ("(PSL(2,7) x W(F4)).C2".equals(from) && source.mOrder.equals(Z.valueOf(387072))) {
          // The maximal hosts of L2(7) in J2 are U3(3) and
          // L2(7):2. Within U3(3) it is maximal, with trivial
          // centralizer. The full lifted centralizer has order at
          // most 240, below the commuting W(F4) of order 1152.
          return true;
        }
      }
      if (n == 24 && "(C3.M10 x D8).C2".equals(from) && source.mOrder.equals(Z.valueOf(34560))
        && ("W(E8) wr S3".equals(to) && mOrder.equals(Z.valueOf(696729600).pow(3).multiply(6))
          || "((SL(2,5) Y SL(2,5)):(C2 x C2)) wr S3".equals(to) && mOrder.equals(Z.valueOf(28800).pow(3).multiply(6)))) {
        // The normal perfect 3.A6 is killed by S3, leaving a
        // 2-group, which cannot act transitively on three blocks.
        return true;
      }
      if (n == 24 && "(SL(2,7) Y Q16).C2".equals(from) && source.mOrder.equals(Z.valueOf(5376)) && fullSignedTarget()) {
        // The normal SL2(7) has center -I, so its orbits on a
        // signed frame are PSL2(7) orbits of equal size. The only
        // nontrivial possibilities dividing 24 are 8 and 24:
        // an index-12 subgroup would have order 14, but every
        // 7-normalizer in PSL2(7) has order 21.
        // On 24 points the centralizer has order at most 2*3.
        // On three 8-point orbits the point stabilizers are
        // self-normalizing; the projected centralizer embeds into
        // S3, with kernel of exponent two. In either case there
        // is no element of order eight for the commuting Q16.
        return true;
      }
      if (n == 24 && "(((SL(2,5) Y SL(2,5)):C2) x A5):C2".equals(from)
        && source.mOrder.equals(Z.valueOf(1728000)) && "((SL(2,5) Y SL(2,5)):(C2 x C2)) wr S3".equals(to)
        && mOrder.equals(Z.valueOf(28800).pow(3).multiply(6))) {
        // All three perfect factors fix every block. Neither
        // covered A5 has fixed vectors, since both contain -I;
        // the third A5 is normal and has no fixed vectors by
        // irreducibility. But only two simple factors per block
        // can carry nontrivial commuting images of these three.
        return true;
      }
      if (n == 24 && "C6.A7:C2".equals(from) && source.mOrder.equals(Z.valueOf(30240))) {
        if ("(C6.PSL(3,4).C2 Y D8).C2".equals(to) && mOrder.equals(Z.valueOf(1935360))) {
          // The A7 section of the perfect cover would have index
          // eight in L3(4), but its least proper index is 21.
          return true;
        }
        if ("(C2.J2 Y SL(2,5)):C2".equals(to) && mOrder.equals(Z.valueOf(145152000))) {
          // The SL(2,5) component cannot carry the A7 section.
          // None of the maximal subgroups of J2 can carry it either.
          final int[] maximal = {6048, 2160, 1920, 1152, 720, 1200, 336, 300, 60};
          return Arrays.stream(maximal).noneMatch(x -> x % 2520 == 0);
        }
      }
      if (n == 28 && "(C2 x PSL(2,13)) wr C2".equals(from) && source.mOrder.equals(Z.valueOf(9539712))
        && "(C2 x S15) wr C2".equals(to) && mOrder.equals(factorial(15).shiftLeft(1).square().shiftLeft(1))
        && block() == 14 && RationalBlockSpectra.simplexHull(blockGenerators(), blockForm()).isPresent()) {
        // The normal PSL(2,13)^2 fixes both blocks. On the 15
        // simplex vertices of either block it cannot be transitive
        // (its order is prime to five). The resulting nonzero fixed
        // subspace of the normal subgroup contradicts irreducibility.
        return true;
      }
      if (n == 28 && "(C2 x J2).C2".equals(from) && source.mOrder.equals(Z.valueOf(2419200))
        && "(W(A2) x W(E7)) wr C2".equals(to) && mOrder.equals(Z.valueOf(6L * 2903040).square().shiftLeft(1))) {
        // The simple J2 subgroup has trivial block permutation, but
        // its order (with a factor 5^2) does not divide the local order.
        return Z.valueOf(6L * 2903040).mod(604800) != 0;
      }
      if (n == 28 && (rankTwentyEightSection(from, to, source.mOrder) || rankTwentyEightLocal(source, from, to))) {
        return true;
      }
      if (n != 30) {
        return false;
      }
      if (fullSignedTarget()) {
        // The sign kernel is abelian. Two commuting nonabelian
        // simple factors cannot share a permutation orbit here: a
        // transitive centralizer is semiregular, and in the multiple
        // orbit case one factor would need to permute at least d
        // orbits of size at least d, with d the minimum proper index.
        if (("(C2 x W(A15)) wr C2".equals(from)
          && source.mOrder.equals(factorial(16).shiftLeft(1).square().shiftLeft(1)))
          || ("(C2 x Sp(6,2)) wr C2".equals(from)
          && source.mOrder.equals(Z.valueOf(2903040).square().shiftLeft(1)))
          || ("(C2 x W(E6)) wr C2".equals(from)
          && source.mOrder.equals(Z.valueOf(103680).square().shiftLeft(1)))) {
          // Minimum orbit sizes 16, 28, and 27 respectively require
          // more than 30 letters for two disjoint supports.
          return true;
        }
        if ("(C2 x W(A6)) wr C2".equals(from)
          && source.mOrder.equals(factorial(7).shiftLeft(1).square().shiftLeft(1))) {
          // The conjugate A7 factors have disjoint, equally sized
          // supports. The normal A7^2 has equal orbit lengths on the
          // transitive frame, and its quotient is a 2-group. The only
          // orbit split with equal numbers for the two factors is
          // 15+15. The S7 normalizer has no subgroup of index 15.
          return true;
        }
      }
      if ("(C2 x W(A6)) wr C2".equals(from)
        && source.mOrder.equals(factorial(7).shiftLeft(1).square().shiftLeft(1))
        && "(C2 x W(A15)) wr C2".equals(to) && mOrder.equals(factorial(16).shiftLeft(1).square().shiftLeft(1))
        && block() == 15 && RationalBlockSpectra.simplexHull(blockGenerators(), blockForm()).isPresent()) {
        // The A7^2 fixes the two blocks and cannot be transitive on
        // either set of 16 simplex vertices. It has fixed vectors
        // there, contrary to normality and irreducibility.
        return true;
      }
      if ("(C2 x PGL(2,7)) wr S5".equals(from)
        && source.mOrder.equals(Z.valueOf(672).pow(5).multiply(120))
        && "(C2 x W(A6)) wr S5".equals(to) && mOrder.equals(factorial(7).shiftLeft(1).pow(5).multiply(120))) {
        // The five normal simple factors fix the five blocks by
        // order and can only act one per local S7. Each outer
        // extension PGL(2,7) normalizes its sole support and would
        // act transitively on seven vertices. The ATLAS maximal
        // indices 2, 8, 21 and 28 exclude a stabilizer of index 7.
        return true;
      }
      if ("(C2 x C3.S6).C2".equals(from) && source.mOrder.equals(Z.valueOf(8640))
        && ("(C2 x W(E6)) wr S5".equals(to) && mOrder.equals(Z.valueOf(103680).pow(5).multiply(120))
          || "((C6 x PSU(4,2)).C2) wr S3".equals(to) && mOrder.equals(Z.valueOf(311040).pow(3).multiply(6)))) {
        // The perfect 3.A6 fixes the blocks and its local image
        // lies in PSU(4,2), the local perfect core in either target.
        // A faithful copy would have index 24, but the least
        // proper index is 27. Each projection kills its center.
        return true;
      }
      if ("C2 x C3.S7".equals(from) && source.mOrder.equals(Z.valueOf(30240))
        && "C2 x W(A2) x Sp(6,2)".equals(to) && mOrder.equals(Z.valueOf(17418240))) {
        // A faithful projection of 3.A7 to the symplectic factor
        // would belong to one of its ATLAS maximal subgroups.
        final int[] maximal = {51840, 40320, 23040, 12096, 10752, 4608, 4320, 1512};
        return Arrays.stream(maximal).noneMatch(x -> x % 7560 == 0);
      }
      if ("(C2 x PSU(4,2)):C2".equals(from) && source.mOrder.equals(Z.valueOf(103680))
        && "((C6 x PSU(4,2)).C2) wr S3".equals(to) && mOrder.equals(Z.valueOf(311040).pow(3).multiply(6))
        && source.derivedHasScalarCommutant()) {
        // The simple perfect subgroup fixes the three blocks but
        // cannot have a proper rational invariant subspace.
        return true;
      }
      if ("C2 x W(A2) x W(A6)".equals(from) && source.mOrder.equals(Z.valueOf(60480))
        && "(C2 x C3.PSU(4,3)).(C2 x C2)".equals(to) && mOrder.equals(Z.valueOf(78382080))
        && perfectCommutantSmall()) {
        // An A7 in PSU(4,3) has trivial centralizer in Aut(PSU(4,3))
        // (Rodriguez--Scherer--Thevenaz, Finite simple groups and
        // localization). A commuting S3 would lie in the kernel
        // of the action on the simple quotient. The action on its
        // perfect cover is then trivial, giving an abelian kernel.
        return true;
      }
      if ("(C2 x C3.S6).C2".equals(from) && source.mOrder.equals(Z.valueOf(8640))
        && "(C2 x W(A2)) wr S15".equals(to) && mOrder.equals(Z.valueOf(12).pow(15).multiply(factorial(15)))
        && source.perfectCommutantSmall()) {
        // The perfect 3.A6 acts transitively (its nontrivial orbit
        // lengths divide 15 and are >=6). Its central C3 is killed
        // on 15 points. Its normal center has no rational fixed
        // vectors, so the certified 2-dimensional commutant of
        // the cover is Q(zeta_3). Its finite units have order six;
        // -I and that C3 are present, so the ambient group maps
        // onto the full Aut(A6). Both centralizing generators
        // are killed on the blocks. But the outer automorphism
        // exchanges the two possible A6 stabilizer classes of
        // index 15, so no such action extends to all of Aut(A6).
        return true;
      }
      if ("C2 x W(A5) x W(E6)".equals(from) && source.mOrder.equals(Z.valueOf(74649600))
        && "((C6 x PSU(4,2)).C2) wr S3".equals(to) && mOrder.equals(Z.valueOf(311040).pow(3).multiply(6))) {
        // The S6 tensor factor has minimum faithful degree 5 (the
        // hook formula). The rational degree of any nontrivial
        // PSU(4,2) constituent is >=6: it is faithful and its
        // order has 3-part 3^4, exceeding Minkowski's bound for
        // degree <=5. Since 30=5*6, restriction to PSU(4,2) is
        // a sum of copies of one irreducible degree-six module.
        // That group fixes the blocks but cannot preserve a 10-space.
        return true;
      }
      if ("(C2 x PSU(4,2) x 3+^(1+2):SL(2,3)).C2".equals(from) && source.mOrder.equals(Z.valueOf(67184640))) {
        if ("(C2 x W(E6)) wr S5".equals(to) && mOrder.equals(Z.valueOf(103680).pow(5).multiply(120))) {
          // The simple factor fixes each block and, by normality and
          // irreducibility, acts nontrivially on every block. Its
          // block centralizers have order dividing 103680/25920=4.
          // The order-three commutator subgroup of the commuting
          // extraspecial 3-group fixes the blocks: a 3-subgroup of
          // S5 is cyclic. It would act trivially on every block.
          return true;
        }
        if ("((C6 x PSU(4,2)).C2) wr S3".equals(to) && mOrder.equals(Z.valueOf(311040).pow(3).multiply(6))) {
          // The extraspecial 3-group lies in the second derived
          // subgroup: both SL(2,3) and its derived Q8 contain the
          // involution inverting the quotient by the extraspecial
          // center. It therefore fixes the three blocks. Each local
          // image has order dividing 311040/25920=12 and is abelian.
          return true;
        }
      }
      final int permutationDegree;
      if ("(C2 x W(A2)) wr S15".equals(to) && mOrder.equals(Z.valueOf(12).pow(15).multiply(factorial(15)))) {
        permutationDegree = 15;
      } else if ("C2 x W(A2) x W(A15)".equals(to) && mOrder.equals(factorial(16).multiply(12))) {
        permutationDegree = 16;
      } else {
        return false;
      }
      // In each target the kernel of the map to its symmetric group
      // is solvable. A quasisimple source subgroup cannot map
      // trivially there. Every proper subgroup of a perfect central
      // cover projects to a proper subgroup of its simple quotient.
      if ("(C2 x C3.PSU(4,3)).(C2 x C2)".equals(from) && source.mOrder.equals(Z.valueOf(78382080))) {
        return permutationDegree < 112; // ATLAS U4(3), least index.
      }
      if ("(C2 x C3.PSL(3,4)).(C2 x C2)".equals(from) && source.mOrder.equals(Z.valueOf(483840))) {
        return permutationDegree < 21; // ATLAS L3(4), least index.
      }
      if (permutationDegree == 16 && onlyNaturalAtMinimum(16)
        && "C2 x W(A2) x W(A6)".equals(from) && source.mOrder.equals(Z.valueOf(60480))) {
        // The normal A7 maps trivially into the S3 factor and acts
        // with fixed vectors in the deleted permutation module: it
        // cannot be transitive on sixteen letters. Its maximal
        // subgroup indices are 7, 15, 21, 35; none divides 16.
        return true;
      }
      if (permutationDegree == 16
        && ("(C2 x C3.S6).C2".equals(from) && source.mOrder.equals(Z.valueOf(8640))
          || "C2 x C3.S7".equals(from) && source.mOrder.equals(Z.valueOf(30240)))) {
        // For the center of either perfect triple cover to act on
        // one orbit, the stabilizer must avoid it. That orbit has
        // size three times a nontrivial index in A6 or A7, hence
        // at least 18. The other target factors are solvable.
        return true;
      }
      return "C2 x W(A2) x Sp(6,2)".equals(from) && source.mOrder.equals(Z.valueOf(17418240))
        && permutationDegree < 28; // ATLAS S6(2), least index.
    }

    private boolean rankTwentyEightSection(final String from, final String to, final Z sourceOrder) {
      final boolean unitary = "(PSU(3,3) x (Q8 Y C4).S3).C2".equals(from)
        && sourceOrder.equals(Z.valueOf(1161216));
      if (unitary && "W(F4) wr S7".equals(to) && mOrder.equals(Z.valueOf(1152).pow(7).multiply(factorial(7)))) {
        // The simple U3(3) is too large for S7 and each base group.
        return true;
      }
      if (unitary && "(C2 x PO+(8,2)):S3".equals(to) && mOrder.equals(Z.valueOf(2090188800L))) {
        // The only maximal hosts for U3(3) in O8+(2) by order
        // are S6(2) and A9. A9 is impossible: the minimum
        // nontrivial permutation degree of U3(3) is 28. In
        // S6(2) the only remaining maximal host is U3(3):2,
        // which is self-centralizing on its simple core.
        // Apply this to the whole normalizer, not just the
        // simple subgroup. The outer S3 and scalar extension
        // contribute at most 12 to the centralizer, below 96.
        return true;
      }
      if ("C2 x PSU(3,5):C2".equals(from) && sourceOrder.equals(Z.valueOf(504000))
        && "(C2 x S5) wr S7".equals(to) && mOrder.equals(Z.valueOf(240).pow(7).multiply(factorial(7)))) {
        return true; // The same argument applies to U3(5).
      }
      if ("(C2.J2 Y SL(2,3)).C2".equals(from) && sourceOrder.equals(Z.valueOf(29030400))
        && "(C2 x PO+(8,2)):S3".equals(to) && mOrder.equals(Z.valueOf(2090188800L))) {
        // The perfect 2.J2 maps to the orthogonal component. No
        // ATLAS maximal subgroup of O8+(2) can carry its J2 section.
        final int[] maximal = {1451520, 1290240, 181440, 155520, 110592, 15552, 14400};
        return Arrays.stream(maximal).noneMatch(order -> order % 604800 == 0);
      }
      if ("(C2 x G2(3)) wr C2".equals(to) && mOrder.equals(Z.valueOf(8491392).square().shiftLeft(1))) {
        if ("(C2 x PGL(2,13)) wr C2".equals(from) && sourceOrder.equals(Z.valueOf(38158848))) {
          // L2(13) is maximal and self-centralizing in G2(3). The
          // two simple factors occupy different blocks, and neither
          // local normalizer can realize the outer PGL involution.
          return true;
        }
        if ("S3 x (PSU(3,3) x C4).C2".equals(from) && sourceOrder.equals(Z.valueOf(290304))) {
          // A U3(3) in G2(3) is self-centralizing (the only maximal
          // hosts are the U3(3):2 classes). On each block the normal
          // simple factor acts nontrivially, as its global fixed
          // space is zero. Its centralizer is a 2-group; the
          // commuting order-three element of S3 cannot survive.
          return true;
        }
      }
      if ("(Sp(6,3) x C3).C2".equals(to) && mOrder.equals(Z.valueOf(55024220160L))) {
        if ("Sz(8):C3 x C4".equals(from) && sourceOrder.equals(Z.valueOf(349440))) {
          // ATLAS PSp6(3): no maximal subgroup order is divisible
          // by 29120. The only hosts with both 7 and 13 lack 5.
          return true;
        }
        if (unitary) {
          // The sole maximal host for U3(3) is U3(3):2 x 2; its
          // centralizer has order 2. Lifting through the central
          // kernel (order six) and outer index two gives at most
          // 24, not enough for the source's commuting order 96.
          return true;
        }
        if ("(SL(2,13) Y SL(2,3)).C2".equals(from) && sourceOrder.equals(Z.valueOf(52416))) {
          // The only other candidate maximal host for L2(13) is
          // L2(27):3, whose simple factor has no such subgroup
          // by Dickson's list. Thus L2(13) is self-centralizing.
          // The commuting SL2(3) has no index-two quotient and
          // cannot fit in the abelian kernel of the projective map.
          return true;
        }
      }
      return false;
    }

    private boolean rankTwentyEightLocal(final Candidate source, final String from, final String to) {
      if ("(C2 x PGL(2,13)) wr C2".equals(from) && source.mOrder.equals(Z.valueOf(38158848)) && fullSignedTarget()
        && source.localClassSpectrum().isPresent() && source.mFullWreath) {
        // Two commuting copies of L2(13) need disjoint supports of
        // at least 14 points, forcing a local 14-line action. The
        // local PGL group must act on the projective line. The two
        // point-stabilizer sign characters extend to the full
        // group (trivial and determinant-square); the independent
        // scalar sign makes their two histograms identical.
        return source.mLocalClassSpectrum.exceeds(RationalBlockSpectra.signedProjectiveLine(13));
      }
      if (!"(C2 x PSL(2,13)) wr C2".equals(from) || !source.mOrder.equals(Z.valueOf(9539712))
        || source.localClassSpectrum().isEmpty() || !source.mFullWreath || localClassSpectrum().isEmpty() || !mFullWreath) {
        return false;
      }
      final RationalBlockSpectra.SpectrumTable target;
      if ("(C2 x PGL(2,13)) wr C2".equals(to) && mOrder.equals(Z.valueOf(38158848))) {
        if (source.mLocalPerfectInput != null && mLocalPerfectInput != null
          && source.mLocalPerfectInput.mOrder.equals(Z.valueOf(1092)) && mLocalPerfectInput.mOrder.equals(Z.valueOf(1092))) {
          final RationalBlockSpectra.SpectrumTable left = source.checkedLocalSubgroup(source.mLocalPerfectInput, false);
          return left.exceeds(checkedLocalSubgroup(mLocalPerfectInput, false));
        }
        target = mLocalClassSpectrum;
      } else if ("(C2 x G2(3)) wr C2".equals(to) && mOrder.equals(Z.valueOf(8491392).square().shiftLeft(1))
        && mCensus.mG2LocalRestriction != null) {
        if (mG2RestrictionSpectrum == null) {
          mG2RestrictionSpectrum = checkedLocalSubgroup(mCensus.mG2LocalRestriction, true);
        }
        target = mG2RestrictionSpectrum;
      } else {
        return false;
      }
      // Each simple factor injects into its own block because the
      // local L2(13) subgroup of either target is self-centralizing.
      // All order-three elements of the signed source local group
      // lie in L2(13); compare those spectra with the local host.
      return source.mLocalClassSpectrum.hasSpectrum(14, 0, t -> t[0] != 14 && t[2] == 14 && !target.contains(t));
    }

    private RationalBlockSpectra.SpectrumTable checkedLocalSubgroup(final LocalClassInput input, final boolean signed) {
      final Q[][] basis = input.mBasis;
      if (!Arrays.deepEquals(basis, mLocalClassInput.mBasis)) {
        throw new IllegalArgumentException("The local subgroup was not expressed in the checked block basis");
      }
      final int n = basis.length;
      final Q[][] form = new Q[n][n];
      for (int i = 0; i < n; ++i) {
        final Q[] b = RationalBlockModels.action(basis[i], mGram);
        for (int j = 0; j < n; ++j) {
          form[i][j] = dot(b, basis[j]);
        }
      }
      RationalGroupForms.checkInvariant(form, input.mLifts.toArray(new Q[0][][]));
      return new RationalBlockSpectra.SpectrumTable(n, input.mOrder, input.mCounts, signed);
    }

    private boolean perfectCommutantSmall() {
      for (final int prime : new int[] {67, 101, 103}) {
        final int[][][] data = new int[mGenerators.length][mGram.length][mGram.length];
        for (int k = 0; k < data.length; ++k) {
          for (int i = 0; i < data[k].length; ++i) {
            for (int j = 0; j < data[k].length; ++j) {
              final Q a = mGenerators[k][i][j];
              if (!a.isInteger()) {
                return false;
              }
              data[k][i][j] = a.toZ().mod(Z.valueOf(prime)).intValueExact();
            }
          }
        }
        // For these central covers the quotient by the perfect
        // subgroup is of order eight, and hence metabelian.
        if (ModularInvariantSubspaces.derivedCommutantAtMost(data, prime, 420000000, 2, 2)) {
          return true;
        }
      }
      return false;
    }

    private boolean planeInductionObstruction(final Candidate source) {
      if (mGram.length != 28 || block() != 2 || !mType.startsWith("(C2 x S3) wr S14")
        || !mOrder.equals(Z.valueOf(12).pow(14).multiply(factorial(14))) || !source.mOrder.equals(Z.valueOf(26208))
        || (!source.mType.contains("PSL(2,13)") && !source.mType.contains("PGL(2,13)"))) {
        return false;
      }
      // PSL(2,13) is normal in the source. Its order-13 subgroup
      // forces a transitive orbit of length 14, since all its orbit
      // sizes must agree. Its index-14 stabilizer is the normalizer
      // of one Sylow 13-subgroup. Thus the full stabilizer normalizes
      // that same cyclic group and its plane action kills it.
      return RationalIndexTwoSpectra.excludesPlaneInduction(source.mGenerators, source.mSeed, 26208, 13, 14);
    }

    private boolean normalizerObstruction(final Candidate source) {
      if (mCensus.mG2Normalizer == null || mGram.length != 28 || !mOrder.equals(Z.valueOf(4245696).multiply(24))
        || !"(C2 x S3 x G2(3)).C2".equals(mType) || !source.mOrder.equals(Z.valueOf(26208))
        || (!source.mType.contains("PSL(2,13)") && !source.mType.contains("PGL(2,13)"))) {
        return false;
      }
      if (!mG2NormalizerChecked) {
        for (final Q[][] g : mCensus.mG2Normalizer) {
          for (final Q[] row : g) {
            if (Arrays.stream(row).anyMatch(x -> !x.isInteger())) {
              throw new IllegalArgumentException("Normalizer does not preserve the ambient lattice");
            }
          }
        }
        // Integral Gram isometries belong to the given integrally
        // maximal group. The ATLAS maximal-subgroup list leaves one
        // conjugacy class of PSL(2,13) in its G2(3) core. Index 3888
        // fixes the full normalizer order; Java checks it and its core.
        RationalGroupForms.certify(mGram, mCensus.mG2Normalizer, new int[0]);
        mG2NormalizerChecked = true;
      }
      return RationalIndexTwoSpectra.excludesInNormalizer(source.mGenerators, source.mSeed,
        mCensus.mG2Normalizer, mCensus.mG2Seed, 26208, 1092);
    }

    private boolean leechObstruction(final Candidate source) {
      if (mCensus.mLeech == null || mGram.length != 24 || !mOrder.equals(new Z("8315553613086720000"))) {
        return false;
      }
      if (mLeechLattice == null) {
        // This candidate's invariant positive form is checked before the
        // sieve reaches this method. The 24-dimensional even unimodular
        // rootless lattice is uniquely the Leech lattice.
        mLeechLattice = RationalLatticeIsometry.isRootlessEvenUnimodular(primitive());
      }
      if (!mLeechLattice) {
        return false;
      }
      final Predicate<int[]> missing = t -> !mCensus.mLeech.contains(t);
      return source.wordSpectra().stream().anyMatch(missing)
        || source.mOrder.compareTo(Z.valueOf(RationalIndexTwoSpectra.GROUP_LIMIT)) <= 0
          && source.spectrum().isPresent() && source.spectrum().orElseThrow().hasSpectrum(missing);
    }

    private RationalGroupContainment.Target smallGroup() {
      if (mSmallGroup == null) {
        mSmallGroup = new RationalGroupContainment.Target(mGenerators, mGram.length, mOrder.intValueExact());
      }
      return mSmallGroup;
    }

    private boolean signedTarget() {
      final int n = mGram.length;
      for (final Q[][] generator : mGenerators) {
        final BitSet columns = new BitSet();
        for (final Q[] row : generator) {
          int found = -1;
          for (int j = 0; j < n; ++j) {
            if (row[j].signum() != 0) {
              if (found != -1 || !row[j].abs().equals(Q.ONE) || columns.get(j)) {
                return false;
              }
              found = j;
            }
          }
          if (found < 0) {
            return false;
          }
          columns.set(found);
        }
      }
      return true;
    }

    private boolean fullSignedTarget() {
      Z order = Z.ONE;
      for (int i = 1; i <= mGram.length; ++i) {
        order = order.multiply(2L * i);
      }
      return order.equals(mOrder) && signedTarget();
    }

    private boolean signedFrame() {
      if (mSignedFrame == null) {
        mSignedFrame = mOrder.bitLength() <= 48 && mType.startsWith("C2^") && RationalSignedFrames.find(mGenerators, mOrder);
      }
      return mSignedFrame;
    }

    private boolean signedSimplex() {
      if (mSimplexModel == null) {
        mSimplexModel = mSeed != null && RationalSimplexFrames.isSignedSimplex(mGenerators, mGram, mSeed);
      }
      return mSimplexModel;
    }

    private boolean fullSimplex() {
      if (mFullSimplex == null) {
        final int d = mGram.length;
        final String type = mType.split(" = ", 2)[0];
        mFullSimplex = factorial(d + 1).shiftLeft(1).equals(mOrder)
          && (signedSimplex() || ("C2 x S" + (d + 1)).equals(type) && onlyNaturalAtMinimum(d + 1));
      }
      return mFullSimplex;
    }

    private boolean findWordWitness(final Predicate<Q[][]> outside) {
      for (final Q[][] a : mGenerators) {
        if (outside.test(a)) {
          return true;
        }
        for (final Q[][] b : mGenerators) {
          final Q[][] ab = RationalGroupContainment.product(a, b);
          if (outside.test(ab)) {
            return true;
          }
          for (final Q[][] c : mGenerators) {
            if (outside.test(RationalGroupContainment.product(ab, c))) {
              return true;
            }
          }
        }
      }
      return false;
    }

    private boolean signedObstruction() {
      if (mSignedObstruction == null) {
        mSignedObstruction = findWordWitness(a -> !RationalPermutationSpectrum.signedPermutation(a.length, traces(a, a.length)));
      }
      return mSignedObstruction;
    }

    private boolean deletedObstruction() {
      if (mDeletedObstruction == null) {
        mDeletedObstruction = findWordWitness(a -> !RationalPermutationSpectrum.signedDeletedPermutation(a.length, traces(a, a.length + 1)));
      }
      return mDeletedObstruction;
    }
  }

  private static int[] traces(final Q[][] a, final int powers) {
    final int[] traces = new int[powers];
    Q[][] power = a;
    for (int i = 0; i < traces.length; ++i) {
      Q trace = Q.ZERO;
      for (int j = 0; j < a.length; ++j) {
        trace = trace.add(power[j][j]);
      }
      if (!trace.isInteger()) {
        throw new IllegalStateException("Nonintegral trace in a finite rational group");
      }
      traces[i] = trace.toZ().intValueExact();
      if (i + 1 < traces.length) {
        power = RationalGroupContainment.product(power, a);
      }
    }
    return traces;
  }

  private List<Candidate> read(final String line) {
    final RationalE7Census.Input tokens = new RationalE7Census.Input(line);
    final List<Candidate> result = new ArrayList<>();
    tokens.require("[");
    while (!"]".equals(tokens.mToken)) {
      tokens.require("[");
      final Z order = new Z(tokens.mToken);
      tokens.next();
      final List<Q[][]> generators = new ArrayList<>();
      tokens.require("[");
      while (!"]".equals(tokens.mToken)) {
        generators.add(tokens.matrix());
      }
      tokens.require("]");
      final Q[][] gram = tokens.matrix();
      result.add(new Candidate(this, result.size() + 1, order, generators.toArray(new Q[0][][]), gram));
      tokens.require("]");
    }
    tokens.require("]");
    return result;
  }

  private static boolean excludes(final int n, final Candidate smaller, final Candidate bigger,
                                  final RationalInvariantForms left, final RationalInvariantForms right) {
    // The action on the simplex vertices must be transitive: a union
    // of orbits would give a fixed subspace in the deleted representation.
    return left != null && right != null && left.obstruction(right) != 0
      || bigger.fullSimplex() && smaller.mOrder.mod(n + 1) != 0
      || bigger.block() > 1 && smaller.blockObstruction(bigger.block())
      || bigger.block() > 1 && bigger.localHullObstruction(smaller)
      || bigger.alignedBlockObstruction(smaller)
      || !smaller.mType.isEmpty() && (bigger.signedTarget()
        && StructuralPermutationObstructions.excludesTransitiveAction(smaller.mType, smaller.mOrder, n)
        || bigger.fullSimplex() && StructuralPermutationObstructions.excludesTransitiveAction(smaller.mType, smaller.mOrder, n + 1)
        || bigger.block() > 1 && StructuralPermutationObstructions.excludesBlocks(smaller.mType, smaller.mOrder, n / bigger.block(), bigger.block()))
      || bigger.indexObstruction(smaller)
      || bigger.sylowObstruction(smaller)
      || bigger.algebraicSpectralObstruction(smaller)
      || bigger.classObstruction(smaller)
      || bigger.tensorObstruction(smaller)
      || bigger.easySectionObstruction(smaller)
      || bigger.planeInductionObstruction(smaller)
      || bigger.normalizerObstruction(smaller)
      || bigger.leechObstruction(smaller)
      || bigger.coveredCyclicObstruction(smaller)
      || bigger.torusObstruction(smaller)
      || StructuralPermutationObstructions.excludesProduct(smaller.mType, smaller.mOrder, bigger.mType, bigger.mOrder)
      // The derived group centralizes a normal C3; a rational scalar
      // commutant cannot contain an element of order three.
      || StructuralPermutationObstructions.admitsDerivedObstruction(bigger.mType, bigger.mOrder) && smaller.derivedHasScalarCommutant()
      || bigger.signedTarget() && (smaller.fullSimplex() || smaller.signedObstruction())
      || bigger.fullSimplex() && smaller.deletedObstruction()
      || left != null && smaller.localObstruction(bigger) != 0
      || left != null && smaller.globalObstruction(bigger)
      || bigger.commutant().excludes(smaller.commutant());
  }

  private static int count(final int n, final List<Candidate> candidates) {
    if (candidates.isEmpty()) {
      throw new IllegalArgumentException("Empty group catalogue in dimension " + n);
    }
    candidates.sort(Comparator.comparing((Candidate c) -> c.mOrder).reversed());
    final List<Candidate> retained = new ArrayList<>();
    int unresolved = 0;
    for (final Candidate smaller : candidates) {
      int unknown = 0;
      boolean contained = false;
      for (final Candidate bigger : retained) {
        if (bigger.mOrder.equals(smaller.mOrder) || !bigger.mOrder.mod(smaller.mOrder).isZero()) {
          continue;
        }
        final RationalInvariantForms left = smaller.form();
        final RationalInvariantForms right = bigger.form();
        if (bigger.fullSignedTarget() && (smaller.signedTarget() || smaller.signedFrame()) || bigger.fullSimplex() && smaller.signedSimplex()) {
          contained = true;
          break;
        }
        if (excludes(n, smaller, bigger, left, right)) {
          continue;
        }
        final Optional<Boolean> test;
        if (bigger.mOrder.compareTo(SMALL) <= 0 && n <= 12) {
          test = Optional.of(smaller.smallGroup().spectraFit(bigger.smallGroup())
            && RationalGroupContainment.find(smaller.mGenerators, bigger.smallGroup()).isPresent());
        } else {
          test = left == null ? Optional.empty() : smaller.isometry(bigger);
        }
        if (test.orElse(false)) {
          contained = true;
          break;
        }
        if (test.isEmpty()) {
          ++unknown;
        }
      }
      if (!contained) {
        retained.add(smaller);
        unresolved += unknown;
      }
    }
    if (unresolved != 0) {
      throw new IllegalStateException("Dimension " + n + " still has " + unresolved + " unresolved containments");
    }
    return retained.size();
  }

  private void loadImf() throws IOException {
    final String file = record("ImfNativeScreenStructure.txt");
    loadNormalizers();
    loadBlockQuotients();
    loadLocalClasses();
    loadClasses();
    loadG2();
    loadTori();
    loadE8();
    loadLeech();
    loadSylows();
    loadLabels();
    loadRows(file);
    mRecords = null;
  }

  private void loadNormalizers() throws IOException {
    for (final String name : List.of("NativeFrontierTriangleNormalizers.txt", "NativeFrontierUnitaryNormalizers.txt")) {
      final Matcher groups = Pattern.compile("(?ms)^NORMAL_GROUP +(\\d+) +(\\d+) +(\\d+) +(\\d+) *\\r?\\n(.*?)^LOCAL_END")
        .matcher(record(name));
      while (groups.find()) {
        final List<RationalClassInventory.Lift> lifts = new ArrayList<>();
        final Matcher records = Pattern.compile("(?ms)^NORMAL_LIFT +(.*?)(?=^NORMAL_LIFT |\\z)").matcher(groups.group(5));
        while (records.find()) {
          final RationalE7Census.Input input = new RationalE7Census.Input(records.group(1));
          final Z mass = new Z(input.mToken);
          input.next();
          lifts.add(new RationalClassInventory.Lift(input.matrix(), mass));
        }
        mNormalizers.computeIfAbsent(groups.group(1) + "." + groups.group(3), k -> new HashMap<>())
          .computeIfAbsent(Integer.parseInt(groups.group(2)), k -> new ArrayList<>())
          .add(new ClassInput(new Z(groups.group(4)), 1, List.of(), lifts));
      }
    }
  }

  private void loadBlockQuotients() throws IOException {
    final Matcher inventories = Pattern.compile("(?ms)^BLOCKQ_GROUP +(\\d+) +(\\d+) +(\\d+) +(\\d+) *\\r?\\n(.*?)^LOCAL_END")
      .matcher(record("NativeFrontierBlockQuotients.txt"));
    while (inventories.find()) {
      final BlockQuotientInput input = new BlockQuotientInput(new Z(inventories.group(3)), new Z(inventories.group(4)));
      final Matcher records = Pattern.compile("(?ms)^BLOCKQ_(CAYLEY|LIFT) +(.*?)(?=^BLOCKQ_|\\z)").matcher(inventories.group(5));
      while (records.find()) {
        final RationalE7Census.Input tokens = new RationalE7Census.Input(records.group(2));
        if ("CAYLEY".equals(records.group(1))) {
          input.mGraph = Arrays.stream(tokens.matrix()).map(row -> Arrays.stream(row).mapToInt(q -> q.toZ().intValueExact()).toArray()).toArray(int[][]::new);
        } else {
          input.mLocations.add(Integer.parseInt(tokens.mToken));
          tokens.next();
          input.mMass = input.mMass.add(new Z(tokens.mToken));
          tokens.next();
          final Q[][] lift = tokens.matrix();
          input.mLifts.add(lift);
          input.mTraces.add(RationalBlockSpectra.sampleSpectra(new Q[][][] {lift}, 0).get(0));
        }
      }
      mBlockQuotients.put(inventories.group(1) + "." + inventories.group(2), input);
    }
  }

  private void loadLocalClasses() throws IOException {
    for (final String fileName : List.of("NativeFrontierBlocks.txt", "NativeFrontierLastBlocks.txt", "NativeFrontierG23Restriction.txt", "NativeFrontierPSLCores.txt")) {
      final Matcher inventories = Pattern.compile("(?ms)^LOCAL_GROUP +(?:(\\d+) +)?(\\d+) +(\\d+) *\\r?\\n(.*?)^LOCAL_END")
        .matcher(record(fileName));
      while (inventories.find()) {
        final LocalClassInput input = new LocalClassInput(new Z(inventories.group(3)));
        final Matcher records = Pattern.compile("(?ms)^LOCAL_(BASIS|LIFT) +(.*?)(?=^LOCAL_|\\z)").matcher(inventories.group(4));
        while (records.find()) {
          final RationalE7Census.Input tokens = new RationalE7Census.Input(records.group(2));
          if ("BASIS".equals(records.group(1))) {
            input.mBasis = tokens.matrix();
          } else {
            final Z size = new Z(tokens.mToken);
            tokens.next();
            final Q[][] local = tokens.matrix();
            input.mLifts.add(local);
            final int[] trac = RationalBlockSpectra.sampleSpectra(new Q[][][] {local}, 0).get(0);
            input.mCounts.merge(RationalBlockSpectra.cyclotomicIndices(trac), size, Z::add);
          }
        }
        final String dimension = inventories.group(1) == null ? "30" : inventories.group(1);
        if (mLocalInputs.putIfAbsent(dimension + "." + inventories.group(2), input) != null) {
          throw new IllegalArgumentException("Duplicate local inventory");
        }
      }
    }
    mG2LocalRestriction = mLocalInputs.get("28.1007");
  }

  private void loadClasses() throws IOException {
    for (final String fileName : List.of("NativeFrontierClasses.txt", "NativeFrontierMore.txt", "NativeFrontierLastWhole.txt", "NativeFrontierJankoFast.txt")) {
      final Matcher inventories = Pattern.compile("(?ms)^CLASS_GROUP +(\\d+) +(\\d+) +(\\d+) +(\\d+) *\\r?\\n(.*?)^CLASS_END")
        .matcher(record(fileName));
      while (inventories.find()) {
        final List<Q[][]> radical = new ArrayList<>();
        final List<RationalClassInventory.Lift> classes = new ArrayList<>();
        final Matcher records = Pattern.compile("(?ms)^CLASS_(RADICAL|LIFT) +(.*?)(?=^CLASS_|\\z)").matcher(inventories.group(5));
        while (records.find()) {
          final RationalE7Census.Input tokens = new RationalE7Census.Input(records.group(2));
          if ("RADICAL".equals(records.group(1))) {
            radical.add(tokens.matrix());
          } else {
            final Z size = new Z(tokens.mToken);
            tokens.next();
            classes.add(new RationalClassInventory.Lift(tokens.matrix(), size));
          }
        }
        if (mClassInputs.putIfAbsent(inventories.group(1) + "." + inventories.group(2),
          new ClassInput(new Z(inventories.group(3)), Integer.parseInt(inventories.group(4)), radical, classes)) != null) {
          throw new IllegalArgumentException("Duplicate ambient class inventory");
        }
      }
    }
  }

  private void loadG2() throws IOException {
    final List<Q[][]> generators = new ArrayList<>();
    final Matcher records = Pattern.compile("(?ms)^NORMALIZER_(SEED|GEN) +(.*?)(?=^NORMALIZER_|^GAP_RESULT_END)")
      .matcher(record("NativeG23Normalizer.txt"));
    while (records.find()) {
      final RationalE7Census.Input input = new RationalE7Census.Input(records.group(2));
      if ("SEED".equals(records.group(1))) {
        mG2Seed = input.vector();
      } else {
        generators.add(input.matrix());
      }
    }
    if (mG2Seed == null || generators.isEmpty()) {
      throw new IllegalArgumentException("Incomplete G2(3) normalizer data");
    }
    mG2Normalizer = generators.toArray(new Q[0][][]);
  }

  private void loadTori() throws IOException {
    final Matcher records = Pattern.compile("(?ms)^TORUS_(SEED|ELEMENT|RADICAL|FIBRE) +(\\d+) +(.*?)(?=^TORUS_|^GAP_RESULT_END)")
      .matcher(record("NativeTorus16FullInputs.txt"));
    while (records.find()) {
      final TorusInput input = mTori.computeIfAbsent(Integer.parseInt(records.group(2)), k -> new TorusInput());
      final RationalE7Census.Input tokens = new RationalE7Census.Input(records.group(3));
      switch (records.group(1)) {
        case "SEED":
          input.mSeed = tokens.vector();
          break;
        case "ELEMENT":
          input.mElement = tokens.matrix();
          break;
        case "RADICAL":
          input.mRadical.add(tokens.matrix());
          break;
        default:
          final Z mass = new Z(tokens.mToken);
          tokens.next();
          input.mClasses.add(new RationalIndexTwoSpectra.QuotientClass(tokens.matrix(), mass));
          break;
      }
    }
  }

  private void loadE8() throws IOException {
    final Map<List<Integer>, Z> spectra = new HashMap<>();
    final Matcher classes = Pattern.compile("(?ms)^WEYL_CLASS +(\\d+) +(.*?)(?=^WEYL_CLASS |^GAP_RESULT_END)")
      .matcher(record("NativeWeylE8Classes.txt"));
    int count = 0;
    while (classes.find()) {
      final Q[][] matrix = new RationalE7Census.Input(classes.group(2)).matrix();
      final int[] trace = RationalBlockSpectra.sampleSpectra(new Q[][][] {matrix}, 0).get(0);
      spectra.merge(RationalBlockSpectra.cyclotomicIndices(trace), new Z(classes.group(1)), Z::add);
      ++count;
    }
    if (count != 112) {
      throw new IllegalArgumentException("Incomplete E8 class inventory");
    }
    mE8 = new RationalBlockSpectra.SpectrumTable(8, Z.valueOf(696729600), spectra);
  }

  private void loadLeech() throws IOException {
    final Map<List<Integer>, Z> spectra = new HashMap<>();
    for (final String line : record("LeechMasses.txt").split("\\R")) {
      if (line.matches("[0-9 ]+: [0-9]+")) {
        final String[] parts = line.split(":");
        final List<Integer> factors = new ArrayList<>();
        Arrays.stream(parts[0].trim().split(" +")).map(Integer::parseInt).forEach(factors::add);
        if (spectra.putIfAbsent(factors, new Z(parts[1].trim())) != null) {
          throw new IllegalArgumentException("Duplicate Leech spectrum");
        }
      }
    }
    mLeech = new RationalBlockSpectra.SpectrumTable(24, new Z("8315553613086720000"), spectra);
  }

  private void loadSylows() throws IOException {
    for (final String sylowFile : List.of("NativeSylow16Inputs.txt", "NativeSylow20Inputs.txt")) {
      final Matcher records = Pattern.compile("(?ms)^IMF_SYLOW +(\\d+) +(\\d+) +(\\d+) +(.*?)(?=^IMF_SYLOW |^GAP_RESULT_END)")
        .matcher(record(sylowFile));
      while (records.find()) {
        final RationalE7Census.Input tokens = new RationalE7Census.Input(records.group(4));
        final List<Q> seed = tokens.vector();
        final List<Q[][]> matrices = new ArrayList<>();
        tokens.require("[");
        while (!"]".equals(tokens.mToken)) {
          matrices.add(tokens.matrix());
        }
        tokens.require("]");
        mSylows.computeIfAbsent(records.group(1) + "." + records.group(2), k -> new HashMap<>())
          .put(Integer.parseInt(records.group(3)), new SylowInput(seed, matrices.toArray(new Q[0][][])));
      }
    }
  }

  private void loadLabels() throws IOException {
    for (final String line : record("ImfNativeTypesStructure.txt").split("\\R")) {
      if (line.startsWith("IMF_TYPE ")) {
        final String[] fields = line.split(" +", 4);
        mTypes.put(fields[1] + "." + fields[2], fields[3].trim());
      }
    }
    for (final String line : record("ImfNativeSimplexSeeds.txt").split("\\R")) {
      if (line.startsWith("IMF_SEED ")) {
        final String[] fields = line.split(" +", 4);
        mSeeds.put(fields[1] + "." + fields[2], new RationalE7Census.Input(fields[3]).vector());
      }
    }
  }

  private void loadRows(final String file) throws IOException {
    final Map<Integer, String> data = new HashMap<>();
    final Matcher rows = Pattern.compile("(?ms)^IMF_DIMENSION +(\\d+) +(.*?)(?=^IMF_DIMENSION |^GAP_RESULT_END)").matcher(file);
    int expected = 8;
    while (rows.find()) {
      final int n = Integer.parseInt(rows.group(1));
      if (n != expected++) {
        throw new IllegalArgumentException("Nonconsecutive structural records");
      }
      data.put(n, rows.group(2));
    }
    if (expected != 32) {
      throw new IllegalArgumentException("Incomplete structural records");
    }
    mRows = data;
  }
}
