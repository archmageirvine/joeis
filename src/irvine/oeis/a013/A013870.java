package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013870 a(n) = 14^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013870 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(14) : mA.multiply(537824);
    return mA;
  }
}
