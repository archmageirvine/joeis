package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013900 <code>a(n) = 21^(5*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013900 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(9261) : mA.multiply(4084101);
    return mA;
  }
}
