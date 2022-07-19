package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058022 Difference between lcm(1,..,n) and the largest prime before lcm(1,..,n) where n runs over the prime powers A000961, LCMs are in A051451.
 * @author Sean A. Irvine
 */
public class A058022 extends A051451 {

  @Override
  public Z next() {
    final Z t = super.next();
    final Z p = mPrime.prevPrime(t);
    return t.subtract(p.isZero() ? Z.valueOf(-2) : p);
  }
}
