package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026263 a(n) = |s(n) - n|, where s = A026262.
 * @author Sean A. Irvine
 */
public class A026263 extends A026262 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
