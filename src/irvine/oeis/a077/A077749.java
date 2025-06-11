package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077749 a(n) contains 2^n digits such that the concatenation a(0)a(1)a(2)...forms a substring of the cyclic concatenation 012345678901234567890123...
 * @author Sean A. Irvine
 */
public class A077749 extends Sequence0 {

  private long mN = -1;
  private int mM = -1;

  @Override
  public Z next() {
    ++mN;
    Z v = Z.ZERO;
    for (long k = 0; k < 1L << mN; ++k) {
      if (++mM == 10) {
        mM = 0;
      }
      v = v.multiply(10);
      v = v.add(mM);
    }
    return v;
  }
}
