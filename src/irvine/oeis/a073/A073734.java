package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a064.A064413;

/**
 * A073734 GCD of consecutive members of the EKG sequence A064413.
 * @author Sean A. Irvine
 */
public class A073734 extends Sequence2 {

  private final Sequence mEkg = new A064413();
  private Z mA = mEkg.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mEkg.next();
    return mA.gcd(t);
  }
}

