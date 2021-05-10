package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047015 T(n,n-3), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047015 extends A047010 {

  private long mN = 2;

  @Override
  public Z next() {
    return get(++mN, mN - 3);
  }
}
