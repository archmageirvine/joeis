package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047132 T(n,n), array T as in A047130.
 * @author Sean A. Irvine
 */
public class A047132 extends A047130 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
