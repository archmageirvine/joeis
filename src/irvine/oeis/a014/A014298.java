package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014298 a(n) = 2^n * (3n)! / (2n+1)!.
 * @author Sean A. Irvine
 */
public class A014298 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3 * mN - 2).multiply(3 * mN - 1).multiply(3).divide(2 * mN + 1);
    }
    return mA;
  }
}

