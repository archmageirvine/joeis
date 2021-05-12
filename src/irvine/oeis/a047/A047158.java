package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047158 T(n,n+3), array T as in A047150.
 * @author Sean A. Irvine
 */
public class A047158 extends A047150 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 3);
  }
}
