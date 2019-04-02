package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007807 A variation on Euclid: a(n)=g(n)-1, where g(0)=0, g(1)=1, g(n+1)=g(n)(g(n-1)+1).
 * @author Sean A. Irvine
 */
public class A007807 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mB.multiply(mA.add(1));
      mA = mB;
      mB = t;
    }
    return mB.subtract(1);
  }
}
