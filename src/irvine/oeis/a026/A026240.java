package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026240 a(n) = |s(n) - n|, where s = A026239.
 * @author Sean A. Irvine
 */
public class A026240 extends A026239 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
