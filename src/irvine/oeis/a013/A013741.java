package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013741 <code>a(n) = 7^(3*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013741 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(49) : mA.multiply(343);
    return mA;
  }
}
