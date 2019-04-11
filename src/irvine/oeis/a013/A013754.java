package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013754 <code>a(n) = 14^(3*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013754 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(14) : mA.multiply(2744);
    return mA;
  }
}
