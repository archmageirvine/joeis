package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062273 a(n) is an n-digit number with digits in increasing order with 0 following 9 and this is maintained in the concatenation of any number of consecutive terms.
 * @author Sean A. Irvine
 */
public class A062273 extends Sequence1 {

  private int mN = 0;
  private int mD = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      if (++mD == 10) {
        mD = 0;
      }
      t = t.multiply(10).add(mD);
    }
    return t;
  }
}

