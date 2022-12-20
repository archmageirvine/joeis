package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A060715 Number of primes between n and 2n exclusive.
 * @author Sean A. Irvine
 */
public class A060715 extends Sequence1 {

  private final Sequence mPi = new A000720();
  private final Sequence mPi2 = new A000720();

  @Override
  public Z next() {
    final Z pi2 = mPi2.next();
    mPi2.next();
    return pi2.subtract(mPi.next());
  }
}
