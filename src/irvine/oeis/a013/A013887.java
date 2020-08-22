package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013887 a(n) = 18^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013887 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(324) : mA.multiply(1889568);
    return mA;
  }
}
