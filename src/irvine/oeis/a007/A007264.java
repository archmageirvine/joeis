package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a030.A030183;

/**
 * A007264.
 * @author Sean A. Irvine
 */
public class A007264 extends A030183 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

