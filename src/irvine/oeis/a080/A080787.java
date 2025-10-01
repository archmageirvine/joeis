package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080787 a(1)=a(2)=1; a(n) = a(n-1) + last decimal digit of a(n-2).
 * @author Sean A. Irvine
 */
public class A080787 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mB.add(mA.mod(10));
    mA = mB;
    mB = t;
    return t;
  }
}
