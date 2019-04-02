package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013794 a(n) = 11^(4n+1).
 * @author Sean A. Irvine
 */
public class A013794 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply(14641);
    return mA;
  }
}
