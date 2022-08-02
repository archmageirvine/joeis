package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a005.A005867;

/**
 * A058250 GCD of n-th primorial number and its totient.
 * @author Sean A. Irvine
 */
public class A058250 extends A002110 {

  private final Sequence mA = new A005867();

  @Override
  public Z next() {
    return super.next().gcd(mA.next());
  }
}
