package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069203 a(1)=0 a(2)=3 a(n+2)=(a(n+1)+a(n))/3 if (a(n+1)+a(n)==0 (mod 3)); a(n+2)=a(n+1)+a(n) otherwise.
 * @author Sean A. Irvine
 */
public class A069203 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z t = mA.add(mB);
    mA = mB;
    if (t.mod(3) == 0) {
      mB = t.divide(3);
    } else {
      mB = t;
    }
    return mB;
  }
}

