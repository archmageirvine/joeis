package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027150 <code>a(n) = A027144(n, floor(n/2))</code>.
 * @author Sean A. Irvine
 */
public class A027150 extends A027144 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
