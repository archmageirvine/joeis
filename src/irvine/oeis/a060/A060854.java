package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000178;

/**
 * A060854 Array T(m,n) read by antidiagonals: T(m,n) (m &gt;= 1, n &gt;= 1) = number of ways to arrange the numbers 1,2,...,m*n in an m X n matrix so that each row and each column is increasing.
 * @author Sean A. Irvine
 */
public class A060854 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000178());
  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return MemoryFactorial.SINGLETON.factorial(n * m).multiply(mA.a(m - 1)).multiply(mA.a(n - 1)).divide(mA.a(m + n - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN + 1 - mM);
  }
}
