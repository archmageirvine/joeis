package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013891 <code>a(n) = 19^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013891 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(361) : mA.multiply(2476099);
    return mA;
  }
}
