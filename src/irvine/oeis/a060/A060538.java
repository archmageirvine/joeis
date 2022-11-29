package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060538 Square array read by antidiagonals of number of ways of dividing n*k labeled items into n labeled boxes with k items in each box.
 * @author Sean A. Irvine
 */
public class A060538 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return MemoryFactorial.SINGLETON.factorial(n * m).divide(MemoryFactorial.SINGLETON.factorial(m).pow(n));
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
