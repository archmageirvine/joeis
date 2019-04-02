package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a212.A212804;

/**
 * A006367 Number of binary vectors of length n+1 beginning with 0 and containing just 1 singleton.
 * @author Sean A. Irvine
 */
public class A006367 extends A212804 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
     if (mA == null) {
       mA = Z.ONE;
       return Z.ONE;
     }
     mB = Z.ZERO;
    } else {
      final Z t = super.next().add(mA).add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

