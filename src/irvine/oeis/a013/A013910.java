package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013910 <code>a(n) = 24^(5*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013910 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(24) : mA.multiply(7962624);
    return mA;
  }
}
