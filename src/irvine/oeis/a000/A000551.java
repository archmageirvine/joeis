package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a074.A074728;

/**
 * A000551 Number of labeled rooted trees of height 2 with n nodes.
 * @author Sean A. Irvine
 */
public class A000551 extends A074728 {

  protected int mN = 2;

  @Override
  public Z next() {
    return super.next().multiply(mN).multiply(++mN);
  }
}
