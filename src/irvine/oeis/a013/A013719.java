package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013719 a(n) = 14^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013719 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(14) : mA.multiply(196);
    return mA;
  }
}
