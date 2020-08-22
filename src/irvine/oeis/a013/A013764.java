package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013764 a(n) = 19^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013764 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : mA.multiply(6859);
    return mA;
  }
}
