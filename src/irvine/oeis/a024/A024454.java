package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;

/**
 * A024454 [ (4th elementary symmetric function of P(n))/(first elementary symmetric function of P(n)) ], where P(n) = {first n+3 primes}.
 * @author Sean A. Irvine
 */
public class A024454 extends A024449 {

  private final Sequence mA = new A007504().skip(4);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
