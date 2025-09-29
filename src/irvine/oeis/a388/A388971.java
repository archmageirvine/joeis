package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a049.A049419;

/**
 * A388971 Positive numbers whose factorial has more exponential divisors than all smaller factorials.
 * @author Sean A. Irvine
 */
public class A388971 extends Sequence1 {

  private final DirectSequence mExponentialDivisors = new A049419();
  private long mN = 0;
  private Z mF = Z.ONE;
  private Z mE = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z e = mExponentialDivisors.a(mF);
      if (e.compareTo(mE) > 0) {
        mE = e;
        return Z.valueOf(mN);
      }
    }
  }
}

