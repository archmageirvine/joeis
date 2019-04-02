package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013873 a(n) = 14^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013873 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(38416) : mA.multiply(537824);
    return mA;
  }
}
