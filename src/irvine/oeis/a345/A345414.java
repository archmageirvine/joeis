package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A345414 a(n) = n^a(n-1) mod 100; a(0) = 0.
 * @author Georg Fischer
 */
public class A345414 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ZERO;
  private static final Z Z100 = Z.valueOf(100);

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA;
    }
    mA = Z.valueOf(mN).pow(mA).mod(Z100);
    return mA;
  }
}
