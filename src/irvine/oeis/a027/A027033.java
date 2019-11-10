package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027033 <code>a(n) = T(n,2n-9)</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027033 extends A027023 {

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 9);
  }
}
