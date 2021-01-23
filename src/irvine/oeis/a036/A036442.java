package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036442 a(n) = 2^((n-1)*(n+2)/2).
 * @author Sean A. Irvine
 */
public class A036442 implements Sequence {

  private Z mA = null;
  private int mN = 1;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(++mN);
    return mA;
  }
}
