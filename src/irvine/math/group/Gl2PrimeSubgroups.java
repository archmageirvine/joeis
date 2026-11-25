package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.group.Gl2SubgroupModel.Classes;
import irvine.math.group.Gl2SubgroupModel.Generated;
import irvine.math.group.Gl2SubgroupModel.Group;
import irvine.math.group.Gl2SubgroupModel.IntKey;
import irvine.math.group.Gl2SubgroupModel.Subgroup;

/**
 * Representatives and normalizers of subgroups of GL(2,p).
 * @author Gregory Morse
 */
final class Gl2PrimeSubgroups {

  private final int mP;
  private final int mT;
  private final Group mProjective;
  private final int mOne;
  private final int[] mPowers;
  private final int[] mLog;
  private final int[] mGenerators;
  private final int mPrimitive;

  private Gl2PrimeSubgroups(final int p) {
    mP = p;
    mT = p - 1;
    mProjective = new Group(p, true);
    mOne = mProjective.mIdentity;
    mPowers = new int[mT + 1];
    mLog = new int[p];
    for (int a = 2; a < p; ++a) {
      int len = 0;
      int x = 1;
      do {
        mPowers[len] = x;
        mLog[x] = len;
        x = x * a % p;
        ++len;
      } while (x != 1);
      if (len == mT) {
        break;
      }
    }
    mPowers[mT] = 1;
    mPrimitive = mPowers[1];
    mGenerators = new int[] {upper(), mProjective.pack(1, 0, 1, 1), mProjective.pack(mPrimitive, 0, 0, 1)};
  }

  private int upper() {
    return mProjective.pack(1, 1, 0, 1);
  }

  static int[] divisors(final int n) {
    final List<Integer> list = new ArrayList<>();
    for (int d = 1; d <= n; ++d) {
      if (n % d == 0) {
        list.add(d);
      }
    }
    return Gl2SubgroupModel.toArray(list);
  }

  private int nonsplitGenerator() {
    final int n = mP + 1;
    final int[] div = divisors(n);
    for (int a = 0; a < mP; ++a) {
      for (int b = 1; b < mP; ++b) {
        final int g = mProjective.project(mProjective.pack(a, mPrimitive * b, b, a));
        if (Arrays.stream(div).allMatch(d -> d == n || mProjective.pow(g, d) != mOne)) {
          return g;
        }
      }
    }
    throw new IllegalStateException("No nonsplit torus generator");
  }

  private void tori(final Classes classes, final boolean split) {
    final int n = split ? mT : mP + 1;
    final int rotation = split ? mGenerators[2] : nonsplitGenerator();
    final int reflection = split ? mProjective.pack(0, 1, 1, 0) : mProjective.pack(1, 0, 0, -1);
    for (final int d : divisors(n)) {
      final int r = mProjective.pow(rotation, n / d);
      classes.offer(r == mOne ? new int[0] : new int[] {r});
      for (int j = 0; j < Math.min(n / d, 2); ++j) {
        final int s = mProjective.multiply(reflection, mProjective.pow(rotation, j));
        classes.offer(r == mOne ? new int[] {s} : new int[] {r, s});
      }
    }
  }

  private List<Subgroup> projective() {
    // Dickson's prime-to-p types: cyclic, dihedral, A4, S4 and A5.
    // The exceptional types are the finite (2,3,k) triangle groups.
    final Classes classes = new Classes(mProjective, Arrays.stream(mGenerators).map(mProjective::project).toArray());
    tori(classes, true);
    tori(classes, false);
    final int[] threes = Arrays.stream(mProjective.allElements())
      .filter(x -> x != mOne && mProjective.pow(x, 3) == mOne).toArray();
    for (final int s : new int[] {mProjective.pack(1, 0, 0, -1),
      mProjective.project(mProjective.pack(0, mPrimitive, 1, 0))}) {
      for (final int t : threes) {
        final int z = mProjective.multiply(s, t);
        final int square = mProjective.multiply(z, z);
        if (square != mOne && (mProjective.multiply(square, z) == mOne
          || mProjective.multiply(square, square) == mOne
          || (mP != 5 && mProjective.multiply(mProjective.multiply(square, square), z) == mOne))) {
          classes.offer(new int[] {s, t});
        }
      }
    }
    return classes.mRepresentatives;
  }

  private static final class State {
    private final int[] mCoordinates;
    private final int mTransport;

    private State(final int[] coordinates, final int transport) {
      mCoordinates = coordinates;
      mTransport = transport;
    }
  }

  private final class CentralLift {
    private final Subgroup mImage;
    private final int mRank;
    private final int[][] mWords;
    private final int[][] mEquations;
    private final int[][] mActionWord;
    private final int[][] mOffsets;

    private CentralLift(final Subgroup image) {
      mImage = image;
      mRank = image.mGenerators.length;
      mWords = new int[image.mOrder][mRank];
      final int[] elements = new int[image.mOrder];
      final int[] lifts = new int[image.mOrder];
      final Map<Integer, Integer> index = new HashMap<>();
      final List<int[]> eqs = new ArrayList<>();
      final Set<IntKey> known = new HashSet<>();
      index.put(mOne, 0);
      elements[0] = mOne;
      lifts[0] = mOne;
      int end = 1;
      for (int i = 0; i < end; ++i) {
        for (int j = 0; j < mRank; ++j) {
          final int g = image.mGenerators[j];
          final int prod = mProjective.multiply(elements[i], g);
          final int raw = mProjective.rawMultiply(lifts[i], g);
          final int[] row = Arrays.copyOf(mWords[i], mRank + 1);
          ++row[j];
          final Integer k = index.putIfAbsent(prod, end);
          if (k == null) {
            elements[end] = prod;
            lifts[end] = raw;
            mWords[end++] = Arrays.copyOf(row, mRank);
          } else {
            for (int h = 0; h < mRank; ++h) {
              row[h] -= mWords[k][h];
            }
            row[mRank] = mLog[mProjective.leading(mProjective.rawMultiply(raw, mProjective.rawInverse(lifts[k])))];
            if (known.add(new IntKey(row))) {
              eqs.add(row);
            }
          }
        }
      }
      mEquations = eqs.toArray(new int[0][]);
      mActionWord = new int[image.mNormalizer.length][mRank];
      mOffsets = new int[image.mNormalizer.length][mRank];
      for (int i = 0; i < image.mNormalizer.length; ++i) {
        final int s = image.mNormalizer[i];
        final int si = mProjective.rawInverse(s);
        for (int k = 0; k < mRank; ++k) {
          final int g = image.mGenerators[k];
          final int a = index.get(mProjective.conjugate(g, si, s));
          final int b = mProjective.rawMultiply(mProjective.rawMultiply(s, lifts[a]), si);
          mActionWord[i][k] = a;
          mOffsets[i][k] = mLog[mProjective.leading(mProjective.rawMultiply(b, mProjective.rawInverse(g)))];
        }
      }
    }

    private int encode(final int[] values, final int d) {
      int code = 0;
      for (final int x : values) {
        code = code * d + x;
      }
      return code;
    }

    private void solutions(final BitSet good, final int[] current, final int i, final int d) {
      if (i == mRank) {
        for (final int[] row : mEquations) {
          int value = row[mRank];
          for (int j = 0; j < mRank; ++j) {
            value += current[j] * row[j];
          }
          if (value % d != 0) {
            return;
          }
        }
        good.set(encode(current, d));
      } else {
        for (int x = 0; x < d; ++x) {
          current[i] = x;
          solutions(good, current, i + 1, d);
        }
      }
    }

    private void add(final List<Subgroup> result) {
      // For each intersection D with the center, enumerate sections
      // above the projective subgroup modulo D by the central relations.
      for (final int d : divisors(mT)) {
        final BitSet good = new BitSet();
        solutions(good, new int[mRank], 0, d);
        for (int x = good.nextSetBit(0); x >= 0; x = good.nextSetBit(0)) {
          final int[] root = new int[mRank];
          for (int i = mRank - 1, t = x; i >= 0; --i, t /= d) {
            root[i] = t % d;
          }
          final Generated stabilizer = new Generated(mProjective);
          final List<State> orbit = new ArrayList<>();
          final Map<Integer, Integer> transport = new HashMap<>();
          orbit.add(new State(root, mOne));
          transport.put(x, mOne);
          good.clear(x);
          for (int i = 0; i < orbit.size(); ++i) {
            final State s = orbit.get(i);
            for (int j = 0; j < mImage.mNormalizer.length; ++j) {
              final int[] y = new int[mRank];
              for (int k = 0; k < mRank; ++k) {
                int value = mOffsets[j][k];
                for (int l = 0; l < mRank; ++l) {
                  value += s.mCoordinates[l] * mWords[mActionWord[j][k]][l];
                }
                y[k] = Math.floorMod(value, d);
              }
              final int yCode = encode(y, d);
              final int t = mProjective.multiply(mImage.mNormalizer[j], s.mTransport);
              final Integer old = transport.putIfAbsent(yCode, t);
              if (old == null) {
                if (!good.get(yCode)) {
                  throw new IllegalStateException("Conjugation left the central solutions");
                }
                good.clear(yCode);
                orbit.add(new State(y, t));
              } else {
                stabilizer.add(mProjective.multiply(mProjective.inverse(old), t));
              }
            }
          }
          final int[] generators = Arrays.copyOf(mImage.mGenerators, mRank + (d == mT ? 0 : 1));
          for (int i = 0; i < mRank; ++i) {
            generators[i] = mProjective.scale(mPowers[root[i]], generators[i]);
          }
          if (d != mT) {
            generators[mRank] = mProjective.pack(mPowers[d], 0, 0, mPowers[d]);
          }
          if ((long) stabilizer.mElements.size() * orbit.size() != mImage.mNormalizerOrder) {
            throw new IllegalStateException("Incorrect central-lift stabilizer");
          }
          result.add(new Subgroup(generators,
            Gl2SubgroupModel.append(stabilizer.generators(), mProjective.pack(mPrimitive, 0, 0, mPrimitive)),
            mImage.mOrder * (mT / d), stabilizer.mElements.size() * mT));
        }
      }
    }
  }

  private int[] nonidentity(final int... generators) {
    return Arrays.stream(generators).filter(x -> x != mOne).toArray();
  }

  private List<Subgroup> compute() {
    final List<Subgroup> result = new ArrayList<>();
    for (final Subgroup p : projective()) {
      new CentralLift(p).add(result);
    }
    final int order = mProjective.mOrder * mT;
    final int borelOrder = mP * mT * mT;
    final int[] divisors = divisors(mT);
    for (final int a : divisors) {
      // If there is more than one Sylow p-subgroup, two of them
      // generate SL(2,p); only the determinant image remains to choose.
      result.add(new Subgroup(nonidentity(mGenerators[0], mGenerators[1], mProjective.pack(mPowers[a], 0, 0, 1)),
        mGenerators, order / a, order));
      // Otherwise the normalizer is the Borel. Its diagonal subgroups
      // are enumerated as Hermite forms of lattices containing (p-1)Z^2.
      for (final int b : divisors) {
        for (int j = 0; j < a; ++j) {
          if ((j * (mT / b)) % a == 0) {
            result.add(new Subgroup(nonidentity(upper(), mProjective.pack(mPowers[a], 0, 0, 1),
              mProjective.pack(mPowers[j], 0, 0, mPowers[b])),
              new int[] {upper(), mGenerators[2], mProjective.pack(1, 0, 0, mPrimitive)},
              borelOrder / a / b, borelOrder));
          }
        }
      }
    }
    return result;
  }

  static List<Subgroup> classes(final int prime) {
    return prime <= 3 ? Gl2SubgroupModel.small(new Group(prime, false)) : new Gl2PrimeSubgroups(prime).compute();
  }
}
