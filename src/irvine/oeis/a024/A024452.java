package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;

/**
 * A024452 a(n) = [ (2nd elementary symmetric function of P(n))/(first elementary symmetric function of P(n)) ], where P(n) = {first n+1 primes}.
 * @author Sean A. Irvine
 */
public class A024452 extends A024447 {

  private final Sequence mA = new A007504().skip(1);

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
