package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014284;

/**
 * A024532 a(n) = [ (3rd elementary symmetric function of P(n))/(first elementary symmetric function of P(n)) ], where P(n) = {1, p(1), p(2), ..., p(n-1)}, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024532 extends A024523 {

  private final Sequence mA = new A014284().skip(2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
