package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026251 a(n) = |s(n) - n|, where s = A026250. Also a(n) = 2*t(n), where t = A026249.
 * @author Sean A. Irvine
 */
public class A026251 extends A026250 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}
