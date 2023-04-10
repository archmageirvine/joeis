package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A062757 Denominator of sum of first n terms of the series 1/15 + 1/63 + 1/80 ... in which the denominators are perfect squares - 1 which are simultaneously other powers, e.g. a(1) = 15 because 16 = 4^2 = 2^4, a perfect square that is also a fourth power; hence 16-1 = 15 qualifies as a term.
 * @author Sean A. Irvine
 */
public class A062757 extends A062965 {

  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.den();
  }
}

