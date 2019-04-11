package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013814 <code>a(n) = 21^(4*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013814 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(21) : mA.multiply(194481);
    return mA;
  }
}
