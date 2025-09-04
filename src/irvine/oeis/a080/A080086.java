package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080086 Number of factors of 3 in the factorial of the n-th prime, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A080086 extends A000040 {

  private long mCount = 0;
  private long mM = 1;

  @Override
  public Z next() {
    final long p = super.next().longValue();
    while (mM <= p) {
      mCount += Functions.VALUATION.l(mM, 3);
      ++mM;
    }
    return Z.valueOf(mCount);
  }
}

