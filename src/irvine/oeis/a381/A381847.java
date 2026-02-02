package irvine.oeis.a381;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A381847 Number of 3 element sets of distinct integer sided rectangles that fill an n X n square.
 * @author Sean A. Irvine
 */
public class A381847 extends Sequence1 {

  protected static final class Cuboid implements Comparable<Cuboid> {
    private final int[] mTriple;

    private Cuboid(final int... triple) {
      mTriple = Arrays.copyOf(triple, triple.length);
      Arrays.sort(mTriple);
    }

    private void set(final int index, final int value) {
      mTriple[index] = value;
      Arrays.sort(mTriple);
    }

    /**
     * Volume of this cuboid.
     * @return the volume
     */
    public int getVolume() {
      return Functions.PRODUCT.i(mTriple);
    }

    /**
     * Surface area of this cuboid.
     * @return the volume
     */
    public int getSurface() {
      final int x = mTriple[0];
      final int y = mTriple[1];
      final int z = mTriple[2];
      return 2 * (x * y + x * z + y * z);
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
      return Arrays.compare(mTriple, other.mTriple);
    }

    public boolean isCube() {
      return mTriple[0] == mTriple[2];
    }

    public boolean isStrict() {
      return mTriple[0] != mTriple[1] && mTriple[1] != mTriple[2];
    }
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected final int mCuboids;
  private int mN;

  protected A381847(final int offset, final int cuboids) {
    if (cuboids > 4) {
      throw new UnsupportedOperationException("Use the A386296 implementation instead");
    }
    mCuboids = cuboids;
    mN = offset - 1;
  }

  protected A381847(final int cuboids) {
    this(1, cuboids);
  }

  /** Construct the sequence. */
  public A381847() {
    this(3);
  }

  protected boolean accept(final List<Cuboid> lst) {
    return true;
  }

  protected Z process(final Set<List<Cuboid>> triples, final int cuboids) {
    // Finally, check the count of distinct triples in the set
    int cnt = 0;
    for (final List<Cuboid> t : triples) {
      if (new TreeSet<>(t).size() == cuboids && accept(t)) {
        if (mVerbose) {
          StringUtils.message(t.toString());
        }
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }

  protected Z t(final int n, final int cuboids) {
    Set<List<Cuboid>> triples = Collections.singleton(Collections.singletonList(new Cuboid(n, n, n)));
    for (int k = 1; k < cuboids; ++k) {
      final Set<List<Cuboid>> next = new HashSet<>();
      for (final List<Cuboid> set : triples) {
        for (final Cuboid t : set) {
          // Choose which component of the triple to split
          for (int j = 0; j < 3; ++j) {
            // Choose the split
            final int tj = t.mTriple[j];
            for (int z = 1; 2 * z <= tj; ++z) {
              final List<Cuboid> copy = new ArrayList<>(set);
              copy.remove(t);
              final Cuboid ta = new Cuboid(t.mTriple);
              ta.set(j, z);
              copy.add(ta);
              final Cuboid tb = new Cuboid(t.mTriple);
              tb.set(j, tj - z);
              copy.add(tb);
              Collections.sort(copy);
              next.add(copy);
            }
          }
        }
      }
      triples = next;
    }
    return process(triples, cuboids);
  }

  @Override
  public Z next() {
    return t(++mN, mCuboids);
  }
}
