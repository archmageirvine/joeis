package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013804 a(n) = 16^(4*n+1).
 * @author Sean A. Irvine
 */
public class A013804 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(16);
    return mA;
  }
}
