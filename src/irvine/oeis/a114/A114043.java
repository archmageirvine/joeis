package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.a115.A115004;

/**
 * A114043 Take an n X n square grid of points in the plane; a(n) = number of ways to divide the points into two sets using a straight line.
 * @author Georg Fischer
 */
public class A114043 extends A115004 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next().multiply2().add(2 * mN * mN - 2 * mN + 1);
  }
}
