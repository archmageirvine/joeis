package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A360826 a(1) = 1, a(n) = (k+1)*(2k+1), where k = Product_{i=1..n-1} a(i).
 * @author Sean A. Irvine
 */
public class A360826 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA.add(1).multiply(mA.multiply2().add(1));
    mA = mA.multiply(t);
    return t;
  }
}
