package irvine.oeis.a342;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A342982 Triangle read by rows: T(n,k) is the number of tree-rooted planar maps with n edges and k+1 faces, n &gt;= 0, k = 0..n.
 * @author Sean A. Irvine
 */
public class A342982 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return mF.factorial(2 * n)
      .divide(mF.factorial(m))
      .divide(mF.factorial(m + 1))
      .divide(mF.factorial(n - m))
      .divide(mF.factorial(n - m + 1));

  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
