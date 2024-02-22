package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066991 Square array read by descending antidiagonals of number of ways of dividing n*k labeled items into k unlabeled orders with n items in each order.
 * @author Sean A. Irvine
 */
public class A066991 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return MemoryFactorial.SINGLETON.factorial(n * m)
      .divide(MemoryFactorial.SINGLETON.factorial(m));
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
