package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024534 a(n) = [ (3rd elementary symmetric function of P(n))/(2nd elementary symmetric function of P(n)) ], where P(n) = {1, p(1), p(2), ..., p(n-1)}, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024534 extends A024523 {

  private final Sequence mA = new A024522().skip(1);

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
