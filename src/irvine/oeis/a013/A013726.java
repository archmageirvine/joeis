package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013726 a(n) = 21^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013726 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(21) : mA.multiply(441);
    return mA;
  }
}
