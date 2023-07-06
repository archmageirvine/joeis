package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;

/**
 * A024453 a(n) = [ (3rd elementary symmetric function of P(n))/(first elementary symmetric function of P(n)) ], where P(n) = {first n+2 primes}.
 * @author Sean A. Irvine
 */
public class A024453 extends A024448 {

  private final Sequence mA = new A007504().skip(3);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
