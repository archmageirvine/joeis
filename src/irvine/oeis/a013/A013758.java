package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013758 <code>a(n) = 16^(3n+1)</code>.
 * @author Sean A. Irvine
 */
public class A013758 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(12);
    return mA;
  }
}
