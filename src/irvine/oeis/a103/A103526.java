package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A103526 a(0) = 3; a(n+1) = 2^a(n) - a(n).
 * @author Georg Fischer
 */
public class A103526 implements Sequence {

  private Z mA = Z.THREE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = Z.ONE.shiftLeft(mA.intValue()).subtract(mA);
    }
    return mA;
  }
}
