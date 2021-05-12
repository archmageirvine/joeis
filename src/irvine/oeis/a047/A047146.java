package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047146 T(n,n+1), array T as in A047140.
 * @author Sean A. Irvine
 */
public class A047146 extends A047140 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 1);
  }
}
