package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024457 [ (4th elementary symmetric function of P(n))/(3rd elementary symmetric function of P(n)) ], where P(n) = {first n+3 primes}.
 * @author Sean A. Irvine
 */
public class A024457 extends A024449 {

  private final Sequence mA = new A024448().skip(1);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
