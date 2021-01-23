package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003818 a(1)=a(2)=1, a(n+1) = (a(n)^3 +1)/a(n-1).
 * @author Sean A. Irvine
 */
public class A003818 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  protected int pow() {
    return 3;
  }

  @Override
  public Z next() {
    if (mA == null) {
      if (mB == null) {
        mB = Z.ONE;
      } else {
        mA = Z.ONE;
      }
    } else {
      final Z t = mB.pow(pow()).add(1).divide(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
