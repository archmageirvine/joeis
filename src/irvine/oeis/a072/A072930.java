package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072930 a(1)=1, a(2)=10, a(n) = floor(a(n-1)/phi) + floor(a(n-2)/phi) where phi is the golden ratio (1+sqrt(5))/2 (if a(2) &lt; 10 a(k) converges to an integer value).
 * @author Sean A. Irvine
 */
public class A072930 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TEN;
      return mB;
    }
    final Z t = CR.valueOf(mA).divide(CR.PHI).floor().add(CR.valueOf(mB).divide(CR.PHI).floor());
    mA = mB;
    mB = t;
    return t;
  }
}

