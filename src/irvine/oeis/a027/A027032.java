package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027032 <code>T(n,2n-8)</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027032 extends A027023 {

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 8);
  }
}
