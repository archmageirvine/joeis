package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047102 T(n,n), array T as in A047100.
 * @author Sean A. Irvine
 */
public class A047102 extends A047100 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
