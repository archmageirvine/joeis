package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013738 <code>a(n) = 6^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013738 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(216);
    return mA;
  }
}
