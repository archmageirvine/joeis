package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078284 a(n) = A078283(n)/n.
 * @author Sean A. Irvine
 */
public class A078284 extends A078283 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}

