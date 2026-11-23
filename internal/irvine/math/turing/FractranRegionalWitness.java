package irvine.math.turing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.turing.FractranMacro.Affine;

import static irvine.math.turing.FractranMacro.A;
import static irvine.math.turing.FractranMacro.K;
import static irvine.math.turing.FractranMacro.ZERO;
import static irvine.math.turing.FractranMacro.constant;
import static irvine.math.turing.FractranMacro.require;

/**
 * Search for and verify recurrent excursions in prescribed counter regions.
 * @author Gregory Morse
 */
public final class FractranRegionalWitness {

  private FractranRegionalWitness() {
  }

  private static final class Region {
    private final int mLead;
    private final int mOther;
    private final int mLeadMin;
    private final int mOtherMin;
    private final int mScale;
    private final int mBias;
    private final int mModulus;
    private final int mRemainder;
    private final int mBootstrap;

    private Region(final int lead, final int other, final int leadMin, final int otherMin, final int scale,
                   final int bias, final int modulus, final int remainder, final int bootstrap) {
      mLead = lead;
      mOther = other;
      mLeadMin = leadMin;
      mOtherMin = otherMin;
      mScale = scale;
      mBias = bias;
      mModulus = modulus;
      mRemainder = remainder;
      mBootstrap = bootstrap;
    }

    private boolean inside(final FractranMacro t, final int width) {
      for (int i = 0; i < width; ++i) {
        if (i != mLead && i != mOther && !(t.get(i).atLeast(0) && t.get(i).atMost(0))) {
          return false;
        }
      }
      final Affine x = t.get(mLead);
      final Affine y = t.get(mOther);
      return x.atLeast(mLeadMin) && y.atLeast(mOtherMin) && y.residue(mModulus, mRemainder)
        && (mScale == 0 || x.multiply(mScale).add(y.multiply(-1)).atLeast(mBias));
    }

    private Affine lower(final Affine y) {
      if (mScale == 0) {
        return constant(mLeadMin);
      }
      final Affine fromCone = y.add(mBias + mScale - 1L).floorDivide(mScale);
      if (fromCone.atLeast(mLeadMin)) {
        return fromCone;
      }
      require(fromCone.atMost(mLeadMin), "Region requires a finite prefix split");
      return constant(mLeadMin);
    }

    private boolean closes(final int[][] f, final Affine y, final Affine extra) {
      final int width = f[0].length;
      final Affine[] z = new Affine[width];
      Arrays.fill(z, ZERO);
      z[mOther] = y;
      z[mLead] = extra.add(lower(y));
      final FractranMacro t = new FractranMacro(f, z);
      return inside(t, width) && t.findsReturn(s -> inside(s, width));
    }

    private boolean proves(final int[][] f, final int leadStride, final int otherStride) {
      final int width = f[0].length;
      final Affine[] z = new Affine[width];
      Arrays.fill(z, ZERO);
      z[0] = constant(1);
      final FractranMacro start = new FractranMacro(f, z);
      start.advance(mBootstrap);
      if (!inside(start, width)) {
        return false;
      }
      for (final int offset : new int[] {0, 2, 5, 10}) {
        final int from = mOtherMin + offset;
        boolean prefix = true;
        for (int y = mOtherMin; y < from && prefix; ++y) {
          prefix = y % mModulus != mRemainder || coversLead(f, constant(y), leadStride);
        }
        if (!prefix) {
          continue;
        }
        for (final int stride : new int[] {otherStride}) {
          if (stride % mModulus != 0 || mScale != 0 && stride % mScale != 0) {
            continue;
          }
          boolean covers = true;
          // Every y >= from lies in exactly one of these progressions.
          for (int y = from; y < from + stride && covers; ++y) {
            if (y % mModulus == mRemainder) {
              try {
                covers = coversLead(f, K.multiply(stride).add(y), leadStride);
              } catch (final ArithmeticException | IllegalStateException e) {
                covers = false;
              }
            }
          }
          if (covers) {
            return true;
          }
        }
      }
      return false;
    }

    private boolean coversLead(final int[][] f, final Affine y, final int stride) {
      for (int j = 0; j < stride; ++j) {
        if (!closes(f, y, A.multiply(stride).add(j))) {
          return false;
        }
      }
      return true;
    }

    private boolean proves(final int[][] f) {
      for (final int leadStride : new int[] {1, 2, 3, 4, 6, 8, 12}) {
        for (final int otherStride : new int[] {1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 36, 48}) {
          if (proves(f, leadStride, otherStride)) {
            return true;
          }
        }
      }
      return false;
    }

    private boolean verifiesDrain(final int[][] f, final int id) {
      final int width = f[0].length;
      final Affine[] z = new Affine[width];
      Arrays.fill(z, ZERO);
      z[0] = constant(1);
      final FractranMacro start = new FractranMacro(f, z);
      start.advance(mBootstrap);
      if (!inside(start, width)) {
        return false;
      }
      final boolean otherDrains = id == 139;
      final int period = id == 94 ? 4 : 3;
      final int first = otherDrains ? mOtherMin : mLeadMin;
      for (int r = 0; r < period; ++r) {
        for (final Affine n : new Affine[] {constant(first + r), K.multiply(period).add(first + r + period)}) {
          z[mLead] = otherDrains ? A.add(mLeadMin) : n;
          z[mOther] = otherDrains ? n : A.add(mOtherMin);
          final FractranMacro t = new FractranMacro(f, z);
          require(inside(t, width) && n.atLeast(1), "Drain cases must start inside the region and make progress");
          t.repeat(n, 2);
          t.repeat(n, 3);
          final int remainder;
          switch (id) {
            case 61:
              t.advance(5);
              remainder = Math.floorMod(2 * (first + r) - 3, period);
              t.repeat(t.get(3).floorDivide(period), 4, 0, 1, 1, 1);
              break;
            case 79:
              remainder = 2 * (first + r) % period;
              t.repeat(t.get(1).floorDivide(period), 4, 0, 1, 0, 0);
              break;
            case 94:
              remainder = (first + r) % period;
              t.repeat(t.get(1).floorDivide(period), 4, 0, 1, 0, 0, 0);
              break;
            case 126:
              remainder = (first + r) % period;
              t.repeat(t.get(2).floorDivide(period), 4, 0, 1, 0, 0);
              break;
            case 139:
              remainder = (first + r) % period;
              t.repeat(t.get(3).floorDivide(period), 4, 0, 1, 0, 0);
              break;
            default:
              throw new IllegalArgumentException("Unknown drain case: " + id);
          }
          t.advance(2 + remainder);
          if (id == 61) {
            t.repeat(t.get(1), 2, 0);
          } else {
            t.repeat(t.get(id == 79 || id == 94 ? 2 : 1), 2, 1);
          }
          require(inside(t, width), "Drains did not return to the region: " + id);
        }
      }
      return true;
    }
  }

  private static Region box(final int b, final int aMin, final int bMin, final int steps) {
    return new Region(0, b, aMin, bMin, 0, 0, 1, 0, steps);
  }

  private static Region cone(final int b, final int bMin, final int scale, final int bias, final int steps) {
    return new Region(0, b, 0, bMin, scale, bias, 1, 0, steps);
  }

  private static final Map<Integer, Region> REGIONS = Map.ofEntries(
    Map.entry(1, cone(3, 2, 2, 2, 12)),
    Map.entry(3, cone(3, 0, 2, 1, 0)),
    Map.entry(9, new Region(0, 1, 2, 0, 2, 1, 1, 0, 10)),
    Map.entry(19, new Region(0, 1, 0, 4, 0, 0, 2, 0, 10)),
    Map.entry(61, box(4, 2, 1, 8)),
    Map.entry(76, box(4, 3, 0, 7)),
    Map.entry(79, box(4, 2, 1, 8)),
    Map.entry(90, new Region(4, 3, 0, 1, 1, 0, 1, 0, 10)),
    Map.entry(93, new Region(4, 3, 0, 1, 1, 0, 2, 1, 8)),
    Map.entry(94, box(4, 1, 0, 0)),
    Map.entry(102, new Region(0, 2, 0, 2, 1, 1, 2, 0, 18)),
    Map.entry(104, cone(4, 1, 2, 1, 10)),
    Map.entry(123, box(4, 1, 0, 0)),
    Map.entry(126, box(4, 1, 0, 0)),
    Map.entry(132, new Region(4, 3, 0, 1, 1, 0, 1, 0, 1)),
    Map.entry(133, box(3, 1, 0, 0)),
    Map.entry(136, cone(4, 2, 2, 1, 10)),
    Map.entry(137, cone(3, 2, 3, 1, 22)),
    Map.entry(138, cone(3, 1, 1, 3, 18)),
    Map.entry(139, box(2, 0, 1, 14))
  );
  private static final Set<Integer> DRAIN_CASES = Set.of(61, 79, 94, 126, 139);

  /**
   * Read numbered transition tables and attempt the checked affine proofs.
   * @param args file with an input row for each described region
   * @throws IOException if the table cannot be read
   */
  public static void main(final String[] args) throws IOException {
    final Set<Integer> seen = new HashSet<>();
    int remaining = 0;
    for (final String row : Files.readAllLines(Path.of(args[0]))) {
      final String[] parts = row.split("\t", -1);
      final int id = Integer.parseInt(parts[0]);
      final Region region = REGIONS.get(id);
      require(region != null && seen.add(id), "Foreign or duplicate regional witness: " + id);
      final int[][] table = Arrays.stream(parts[1].split(";", -1))
        .map(r -> Arrays.stream(r.split(",", -1)).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
      boolean proved;
      try {
        proved = DRAIN_CASES.contains(id) ? region.verifiesDrain(table, id) : region.proves(table);
      } catch (final ArithmeticException | IllegalStateException e) {
        proved = false;
      }
      if (!proved) {
        ++remaining;
      }
      System.out.println((proved ? "proved " : "unresolved ") + id + ' ' + Arrays.deepToString(table));
    }
    require(seen.equals(REGIONS.keySet()), "Missing regional witness records");
    System.out.println("Regional proofs " + (seen.size() - remaining) + '/' + seen.size());
    require(remaining == 0, "Unresolved regional proofs: " + remaining);
  }
}
