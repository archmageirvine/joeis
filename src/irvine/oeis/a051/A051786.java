package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051786 Propp's cubic recurrence: a(0)=a(1)=a(2)=a(3)=1; for n&gt;3, a(n)=(1+a(n-1)*a(n-2)*a(n-3))/a(n-4).
 * @author Sean A. Irvine
 */
public class A051786 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else if (mC == null) {
        mC = Z.ONE;
      } else {
        mD = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = Z.ONE.add(mD.multiply(mC).multiply(mB)).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
