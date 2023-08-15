package irvine.oeis.a115;

import irvine.math.z.Z;

/**
 * A115005 a(n) = (A114043(n) - 1)/2.
 * @author Georg Fischer
 */
public class A115005 extends A115004 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : super.next().add(mN * (mN - 1));
  }
}
