package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013872 <code>a(n) = 14^(5*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013872 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2744) : mA.multiply(537824);
    return mA;
  }
}
