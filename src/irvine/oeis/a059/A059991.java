package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059991 a(n) = 2^(n-2^ord_2(n)) (or 2^(n-A006519(n))).
 * 2^(n - 2^valuation(n, 2))
 * @author Georg Fischer
 */
public class A059991 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN - (1 << LongUtils.valuation(mN, 2)));
  }
}
