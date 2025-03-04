package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075684 For odd numbers 2n-1, the maximum number produced by iterating the reduced Collatz function R defined as R(k) = (3k+1)/2^r, with r as large as possible.
 * @author Sean A. Irvine
 */
public class A075684 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    Z m = mN;
    Z max = mN;
    while (!Z.ONE.equals(m)) {
      m = m.multiply(3).add(1).makeOdd();
      max = max.max(m);
    }
    return max;
  }
}
