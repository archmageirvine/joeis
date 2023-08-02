package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062076 a(n) = (2n-1)^n * n^(2n-1).
 * @author Georg Fischer
 */
public class A062076 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN * 2L - 1).pow(mN).multiply(Z.valueOf(mN).pow(mN * 2L - 1));
  }
}
