package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013787 a(n) = 7^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013787 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(343) : mA.multiply(2401);
    return mA;
  }
}
