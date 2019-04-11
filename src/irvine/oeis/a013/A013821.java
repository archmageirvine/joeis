package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013821 <code>a(n) = 24^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013821 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13824) : mA.multiply(331776);
    return mA;
  }
}
