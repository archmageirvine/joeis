package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027093 <code>a(n) = A027082(n, 2n-6)</code>.
 * @author Sean A. Irvine
 */
public class A027093 extends A027082 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 6);
  }
}
