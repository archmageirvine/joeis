package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a006.A006460;

/**
 * A076087 a(n)= 7*n - 3*sum(i=1,n,b(i)) (see comment for b(i) definition).
 * @author Sean A. Irvine
 */
public class A076087 extends A006460 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(7).subtract(super.next().multiply(3));
    return mSum;
  }
}
