package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A046432 2 steps needed to reach a prime under "Sum of digits raised to its digits' powers" procedure.
 * @author Sean A. Irvine
 */
public class A046432 extends AbstractSequence {

  /** Construct the sequence. */
  public A046432() {
    super(1);
  }

  private long mN = 0;

  static Z sumOfDigitPowers(Z n) {
    Z sum = Z.ZERO;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final long r = qr[1].longValue();
      n = qr[0];
      sum = sum.add(LongUtils.pow(r, r));
    }
    return sum;
  }

  protected int steps() {
    return 2;
  }

  private boolean is(final long n) {
    Z m = Z.valueOf(n);
    for (int k = 1; k < steps(); ++k) {
      m = sumOfDigitPowers(m);
      if (m.isProbablePrime()) {
        return false;
      }
    }
    return sumOfDigitPowers(m).isProbablePrime();
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
