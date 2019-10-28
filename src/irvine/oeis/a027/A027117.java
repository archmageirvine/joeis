package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027117 <code>a(n) = A027113(n, n+4)</code>.
 * @author Sean A. Irvine
 */
public class A027117 extends A027113 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, mN + 4);
  }
}
