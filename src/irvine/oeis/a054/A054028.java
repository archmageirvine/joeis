package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A054028 a(n) = first k such that 2^k &gt;= k^n, (for n &gt;= 2, k &gt;= 2).
 * @author Sean A. Irvine
 */
public class A054028 extends Sequence2 {

  private int mN = 1;
  private int mK = 1;

  @Override
  public Z next() {
    ++mN;
    while (Z.ONE.shiftLeft(++mK).compareTo(Z.valueOf(mK).pow(mN)) < 0) {
      // do nothing
    }
    return Z.valueOf(mK);
  }
}

