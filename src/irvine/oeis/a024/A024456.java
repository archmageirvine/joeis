package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024456 [ 4th elementary symmetric function of P(n))/(2nd elementary symmetric function of P(n)) ], where P(n) = {first n+3 primes}.
 * @author Sean A. Irvine
 */
public class A024456 extends A024449 {

  private final Sequence mA = new A024447().skip(3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
