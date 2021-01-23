package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024536 [ (4th elementary symmetric function of P(n))/(3rd elementary symmetric function of P(n)) ], where P(n) = {1, p(1), p(2), ..., p(n-1)}, p(0) = 1.
 * @author Sean A. Irvine
 */
public class A024536 extends A024524 {

  private final Sequence mA = new SkipSequence(new A024523(), 1);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
