package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027313 a(n) = Sum_{k=0..2n} (k+1) * A026323(n, 2n-k).
 * @author Sean A. Irvine
 */
public class A027313 extends Sequence0 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(3);
    if (Z.THREE.equals(mA)) {
      return Z.ONE;
    } else if (Z.NINE.equals(mA)) {
      return Z.SIX;
    } else {
      return mA;
    }
  }
}
