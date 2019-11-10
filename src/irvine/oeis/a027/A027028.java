package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027028 <code>a(n) = T(n,2n-4)</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027028 extends A027023 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 4);
  }
}
