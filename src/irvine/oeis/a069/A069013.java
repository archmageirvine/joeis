package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069013 a(1)=a(2)=a(3)=1; for n &gt; 3, a(n) = floor(a(n-3) + a(n-2)/a(n-1)).
 * @author Sean A. Irvine
 */
public class A069013 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else {
        mC = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mA;
    mA = mB;
    mB = mC;
    mC = t.add(mA.divide(mB));
    return mC;
  }
}

