package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026256 a(n) = |s(n) - n|, where s = A026255.
 * @author Sean A. Irvine
 */
public class A026256 extends A026255 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
