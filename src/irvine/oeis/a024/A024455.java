package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024455 [ (3rd elementary symmetric function of P(n))/(2nd elementary symmetric function of P(n)) ], where P(n) = {first n+2 primes}.
 * @author Sean A. Irvine
 */
public class A024455 extends A024448 {

  private final Sequence mA = new A024447().skip(2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
