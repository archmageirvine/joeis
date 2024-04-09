package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069162 a(1)=1, a(2)=2, a(n+2)=(a(n+1)+a(n))/2 if a(n+1)+a(n) is even, a(n+2)=(3*(a(n+1)+a(n))+1)/2 otherwise.
 * @author Sean A. Irvine
 */
public class A069162 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA.add(mB);
    mA = mB;
    if (t.isEven()) {
      mB = t.divide2();
    } else {
      mB = t.multiply(3).add(1).divide(2);
    }
    return mB;
  }
}

