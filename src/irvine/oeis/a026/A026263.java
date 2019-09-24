package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026263 <code>a(n) = |s(n) - n|</code>, where s <code>= A026262</code>.
 * @author Sean A. Irvine
 */
public class A026263 extends A026262 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
