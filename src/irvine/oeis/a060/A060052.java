package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a276.A276640;

/**
 * A060052 Triangle read by rows: T(n,k) gives number of r-bicoverings of an n-set with k blocks, n &gt;= 2, k = 3..n+floor(n/2).
 * @author Sean A. Irvine
 */
public class A060052 extends A276640 {

  {
    setOffset(2);
  }

  private int mN = 1;
  private int mM = 1;

  @Override
  protected Z t(final int n, final int m) {
    return super.t(m, n).multiply(MemoryFactorial.SINGLETON.factorial(n)).divide(MemoryFactorial.SINGLETON.factorial(m));
  }

  @Override
  public Z next() {
    if (++mM > mN + mN / 2) {
      ++mN;
      mM = 3;
    }
    return t(mN, mM);
  }
}
