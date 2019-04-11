package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013799 <code>a(n) = 13^(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013799 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(2197) : mA.multiply(28561);
    return mA;
  }
}
