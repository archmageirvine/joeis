package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013886 <code>aa(n) = 18^(5*n + 1)</code>.
 * @author Sean A. Irvine
 */
public class A013886 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(18) : mA.multiply(1889568);
    return mA;
  }
}
