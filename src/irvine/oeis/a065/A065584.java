package irvine.oeis.a065;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065584 Smallest prime beginning with exactly n 1's.
 * @author Sean A. Irvine
 */
public class A065584 extends Sequence0 {

  private final String mDigit;
  private int mN = -1;

  protected A065584(final long digit) {
    mDigit = String.valueOf(digit);
  }

  /** Construct the sequence. */
  public A065584() {
    this(1);
  }

  @Override
  public Z next() {
    return Puma.smallestPrimeBeginningWith(mDigit.repeat(++mN), mDigit, true);
  }
}
