package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027087 a(n) = A027082(n, 2n).
 * @author Sean A. Irvine
 */
public class A027087 extends A027082 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN);
  }
}
