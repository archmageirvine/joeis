package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078446 a(1)=a(2)=1; a(n)=a(n-2)/2 if a(n-2) is even, a(n)=a(n-1)+a(n-2) otherwise.
 * @author Sean A. Irvine
 */
public class A078446 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA.isEven() ? mA.divide2() : mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}


