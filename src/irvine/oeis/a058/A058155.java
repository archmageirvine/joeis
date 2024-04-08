package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058129.
 * @author Sean A. Irvine
 */
public class A058155 extends A058156 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
