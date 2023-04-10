package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a037.A037450;

/**
 * A062834 Denominator of sum of first n terms of the series 1/3 + 1/8 + 1/24 ... in which the denominators are one less than a perfect square that cannot otherwise be written as a power (cf. A062757, A037450).
 * @author Sean A. Irvine
 */
public class A062834 extends A037450 {

  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.den();
  }
}
