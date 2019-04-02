package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009987 Powers of 43.
 * @author Sean A. Irvine
 */
public class A009987 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(43);
    return mA;
  }
}
