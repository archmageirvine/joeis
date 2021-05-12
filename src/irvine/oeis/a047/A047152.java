package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047152 T(n,n), array T as in A047150.
 * @author Sean A. Irvine
 */
public class A047152 extends A047150 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
