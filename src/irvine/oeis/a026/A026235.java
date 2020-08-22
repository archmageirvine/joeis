package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026235 a(n) = |s(n) - n|, where s = A026234.
 * @author Sean A. Irvine
 */
public class A026235 extends A026234 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
