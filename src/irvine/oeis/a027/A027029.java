package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027029 <code>a(n) = T(n,2n-5)</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027029 extends A027023 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 5);
  }
}
