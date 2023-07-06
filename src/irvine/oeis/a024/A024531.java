package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014284;

/**
 * A024531 a(n) = [ (2nd elementary symmetric function of P(n))/(first elementary symmetric function of P(n)) ], where P(n) = {1, p(1), p(2), ..., p(n-1)}, where p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024531 extends A024522 {

  private final Sequence mA = new A014284().skip(1);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
