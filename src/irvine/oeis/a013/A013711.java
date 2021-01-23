package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013711 a(n) = 6^(2n+1).
 * @author Sean A. Irvine
 */
public class A013711 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(36);
    return mA;
  }
}
