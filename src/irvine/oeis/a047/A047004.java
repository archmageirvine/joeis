package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047004 T(n,n-2), array T given by A047000.
 * @author Sean A. Irvine
 */
public class A047004 extends A047000 {

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
