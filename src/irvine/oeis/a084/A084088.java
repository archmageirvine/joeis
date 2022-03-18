package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A084088 Numbers k such that k == 2 (mod 3) and the exponent of the highest power of 2 dividing k is even.
 * @author Georg Fischer
 */
public class A084088 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN % 3 != 2 || (ZUtils.valuation(Z.TWO, Z.valueOf(mN)) & 1) != 0) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
