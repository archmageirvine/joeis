package irvine.oeis.a048;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048790 Array read by antidiagonals: T(n,k) = number of rooted n-dimensional polycubes with k cells, with no symmetries removed (n &gt;= 1, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A048790 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int dimension, final int cells) {
    final ParallelHunter hunter = new ParallelHunter(Math.min(4, cells), Lattices.hypercubic(dimension), true);
    return Z.valueOf(hunter.count(cells)).multiply(cells);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM + 1, mM);
  }
}
