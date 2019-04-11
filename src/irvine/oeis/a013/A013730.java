package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013730 <code>a(n) = 2^(3n+1)</code>.
 * @author Sean A. Irvine
 */
public class A013730 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.shiftLeft(3);
    return mA;
  }
}
