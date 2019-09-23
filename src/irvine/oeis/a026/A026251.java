package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026251 <code>a(n) = |s(n) - n|</code>, where s <code>= A026250</code>. Also <code>a(n) = 2*t(n)</code>, where t <code>= A026249</code>.
 * @author Sean A. Irvine
 */
public class A026251 extends A026250 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
