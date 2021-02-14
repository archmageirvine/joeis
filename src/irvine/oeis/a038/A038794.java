package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038794 T(n,n-4), array T as in A038792.
 * @author Sean A. Irvine
 */
public class A038794 extends A038792 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 5L);
  }
}
