package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055777 a(n) = 3^(3^n).
 * @author Sean A. Irvine
 */
public class A055777 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.pow(3);
    return mA;
  }
}
