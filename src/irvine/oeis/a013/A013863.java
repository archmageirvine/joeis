package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013863 a(n) = 12^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013863 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(144) : mA.multiply(248832);
    return mA;
  }
}
