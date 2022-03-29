package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055590 a(n) = 3^(sum of a(i) where i&lt;n).
 * @author Sean A. Irvine
 */
public class A055590 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    } else {
      final Z t = Z.THREE.pow(mA);
      mA = mA.add(t);
      return t;
    }
  }
}
