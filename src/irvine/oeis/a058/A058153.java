package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058153 Number of labeled monoids of order n.
 * @author Sean A. Irvine
 */
public class A058153 extends A058154 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
