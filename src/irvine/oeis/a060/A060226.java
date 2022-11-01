package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060226 a(n) = n^n - n*(n-1)^(n-1).
 * @author Sean A. Irvine
 */
public class A060226 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN - 1).multiply(mN));
  }
}

