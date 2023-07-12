package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A348131 a(n) is the numerator of the relativistic sum of n velocities of 1/n, in units where the speed of light is 1.
 * @author Georg Fischer
 */
public class A348131 extends Sequence0 {

  private int mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    // a(2n-1) = n^(2n-1) - (n-1)^(2n-1) and a(2n) = ((2n+1)^(2n) - (2n-1)^(2n)) / 2.
    ++mN;
    final int n = mN / 2;
    return ((mN & 1) == 1) ? Z.valueOf(n + 1).pow(mN).subtract(Z.valueOf(n).pow(mN))
      : Z.valueOf(mN + 1).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN)).divide2();
  }
}
