package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001521 a(1) = 1; thereafter a(n+1) = floor(sqrt(2*a(n)*(a(n)+1))).
 * @author Sean A. Irvine
 */
public class A001521 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(mA.add(1)).multiply2().sqrt();
    }
    return mA;
  }
}
