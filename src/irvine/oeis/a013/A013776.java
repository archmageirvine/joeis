package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013776 a(n) = 2^(4*n+1).
 * @author Sean A. Irvine
 */
public class A013776 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.shiftLeft(4);
    return mA;
  }
}
