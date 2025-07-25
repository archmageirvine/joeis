package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;
import irvine.util.string.StringUtils;

/**
 * A386296 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386296 extends Sequence1 {

  private static final class Cuboid implements Comparable<Cuboid> {
    private final int[] mTriple;
    private final int mVolume;

    private Cuboid(final int... triple) {
      mTriple = Arrays.copyOf(triple, triple.length);
      Arrays.sort(mTriple);
      mVolume = Functions.PRODUCT.i(triple);
    }

    /**
     * Volume of this cuboid.
     * @return the volume
     */
    public int volume() {
      return mVolume;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Cuboid)) {
        return false;
      }
      return Arrays.equals(mTriple, ((Cuboid) obj).mTriple);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mTriple);
    }

    @Override
    public String toString() {
      return Arrays.toString(mTriple);
    }

    @Override
    public int compareTo(final Cuboid other) {
      final int c = Integer.compare(mVolume, other.mVolume);
      if (c != 0) {
        return c;
      }
      return Arrays.compare(mTriple, other.mTriple);
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private int mN = 0;
  private int mM = 0;
  private Packer mPacker = null;
  private List<Cuboid> mCuboids = null;
  private long mPrepackCount = 0;
  private long mCount = 0;

  private List<Cuboid> buildCuboids(final int n) {
    final List<Cuboid> cuboids = new ArrayList<>();
    for (int x = 1; x <= n; ++x) {
      for (int y = x; y <= n; ++y) {
        for (int z = y; z <= n; ++z) {
          cuboids.add(new Cuboid(x, y, z));
        }
      }
    }
    Collections.sort(cuboids);
    return cuboids;
  }

  private void search(final int[] set, final int remainingArea, final int remainingCuboids, final int k) {
    if (remainingCuboids == 0) {
      if (remainingArea == 0) {
        ++mPrepackCount;
        if (mPacker.canPack(set)) {
          ++mCount;
        }
      }
      return;
    }
    if (remainingArea == 0) {
      return;
    }
    int j = k;
    while (--j >= 0) {
      final int v = mCuboids.get(j).volume();
      if (v * remainingCuboids < remainingArea) {
        break; // Not enough volume in remaining available cuboids
      }
      if (v <= remainingArea) {
        set[set.length - remainingCuboids] = j;
        search(set, remainingArea - v, remainingCuboids - 1, j);
      }
    }
  }

  private final class Packer {
    private final int mN;
    private final List<List<int[]>> mOrientations;
    private boolean[][][] mOccupied;
    private boolean[] mUsedCuboid; // tracks which cuboids have been placed

    private Packer(final int n, final List<Cuboid> cuboids) {
      mN = n;
      mOrientations = buildOrientations(cuboids);
    }

    private List<List<int[]>> buildOrientations(final List<Cuboid> cuboids) {
      final ArrayList<List<int[]>> lst = new ArrayList<>();
      for (final Cuboid c : cuboids) {
        final HashSet<Triple<Integer>> h = new HashSet<>();
        final int x = c.mTriple[0];
        final int y = c.mTriple[1];
        final int z = c.mTriple[2];
        h.add(new Triple<>(x, y, z));
        h.add(new Triple<>(x, z, y));
        h.add(new Triple<>(y, x, z));
        h.add(new Triple<>(y, z, x));
        h.add(new Triple<>(z, x, y));
        h.add(new Triple<>(z, y, x));
        final ArrayList<int[]> cl = new ArrayList<>();
        for (final Triple<Integer> t : h) {
          cl.add(new int[] {t.left(), t.mid(), t.right()});
        }
        lst.add(cl);
      }
      return lst;
    }

    private boolean canPack(final int[] cuboids) {
      mOccupied = new boolean[mN][mN][mN];
      mUsedCuboid = new boolean[cuboids.length];
      return backtrack(cuboids);
    }

    private boolean backtrack(final int[] cuboids) {
      final int[] cell = findFirstEmpty();
      if (cell == null) {
        return true; // all cells filled
      }

      final int x0 = cell[0];
      final int y0 = cell[1];
      final int z0 = cell[2];

      for (int i = 0; i < cuboids.length; ++i) {
        if (!mUsedCuboid[i]) {
          for (final int[] orient : mOrientations.get(cuboids[i])) {
            final int dx = orient[0];
            final int dy = orient[1];
            final int dz = orient[2];
            if (fits(x0, y0, z0, dx, dy, dz) && canPlace(x0, y0, z0, dx, dy, dz)) {
              place(x0, y0, z0, dx, dy, dz, true);
              mUsedCuboid[i] = true;
              if (backtrack(cuboids)) {
                return true;
              }
              mUsedCuboid[i] = false;
              place(x0, y0, z0, dx, dy, dz, false);
            }
          }
        }
      }
      return false; // no valid placement found
    }

    private int[] findFirstEmpty() {
      for (int x = 0; x < mN; ++x) {
        for (int y = 0; y < mN; ++y) {
          for (int z = 0; z < mN; ++z) {
            if (!mOccupied[x][y][z]) {
              return new int[] {x, y, z};
            }
          }
        }
      }
      return null;
    }

    private boolean fits(final int x, final int y, final int z, final int dx, final int dy, final int dz) {
      return x + dx <= mN && y + dy <= mN && z + dz <= mN;
    }

    private boolean canPlace(final int x0, final int y0, final int z0, final int dx, final int dy, final int dz) {
      for (int x = x0; x < x0 + dx; ++x) {
        for (int y = y0; y < y0 + dy; ++y) {
          for (int z = z0; z < z0 + dz; ++z) {
            if (mOccupied[x][y][z]) {
              return false;
            }
          }
        }
      }
      return true;
    }

    private void place(final int x0, final int y0, final int z0, final int dx, final int dy, final int dz, final boolean value) {
      for (int x = x0; x < x0 + dx; ++x) {
        for (int y = y0; y < y0 + dy; ++y) {
          for (int z = z0; z < z0 + dz; ++z) {
            mOccupied[x][y][z] = value;
          }
        }
      }
    }
  }

  protected Z t(final int n, final int m) {
    mPrepackCount = 0;
    mCount = 0;
    mCuboids = buildCuboids(n);
    if (mVerbose) {
      StringUtils.message(n + " " + mCuboids.size());
    }
    mPacker = new Packer(n, mCuboids);
    search(new int[m], Z.valueOf(n).pow(3).intValueExact(), m, mCuboids.size());
    if (mVerbose) {
      StringUtils.message("n=" + n + " m=" + m + " pre-packing count=" + mPrepackCount);
    }
    return Z.valueOf(mCount);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}

