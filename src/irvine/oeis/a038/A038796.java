package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038796 T(n,n-6), array T as in A038792.
 * @author Sean A. Irvine
 */
public class A038796 extends A038792 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 7L);
  }
}
