package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a241.A241171;

/**
 * A002456 Joffe's central differences of <code>0,</code> A241171(n,n-1).
 * @author Sean A. Irvine
 */
public class A002456 extends A241171 {

  private int mN = 0;

  @Override
  public Z next() {
    return joffeDifference(++mN, mN - 1);
  }
}
