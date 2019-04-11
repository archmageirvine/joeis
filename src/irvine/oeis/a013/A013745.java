package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013745 <code>a(n) = 9^(3*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013745 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(81) : mA.multiply(729);
    return mA;
  }
}
