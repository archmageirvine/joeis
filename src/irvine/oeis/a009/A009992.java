package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009992 Powers of 48: <code>a(n) = 48^n</code>.
 * @author Sean A. Irvine
 */
public class A009992 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(48);
    return mA;
  }
}
