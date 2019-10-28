package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027116 <code>a(n) = A027113(n, n+3)</code>.
 * @author Sean A. Irvine
 */
public class A027116 extends A027113 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
