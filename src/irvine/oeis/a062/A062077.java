package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062077 a(n) = (2n)^n * n^(2n).
 * @author Georg Fischer
 */
public class A062077 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN * 2L).pow(mN).multiply(Z.valueOf(mN).pow(mN * 2L));
  }
}
