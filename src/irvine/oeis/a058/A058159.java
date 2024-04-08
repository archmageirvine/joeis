package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058129.
 * @author Sean A. Irvine
 */
public class A058159 extends A058160 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
