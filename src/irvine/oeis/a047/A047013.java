package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047013 T(n,n-1), array T given by A047010.
 * @author Sean A. Irvine
 */
public class A047013 extends A047010 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN - 1);
  }
}
