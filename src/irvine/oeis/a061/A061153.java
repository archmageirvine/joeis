package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061153 n.2^m+1 are composites for all exponents m in the range 0&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A061153 extends Sequence0 {

  private long mN = 46;

  private boolean is(long n) {
    Z t = Z.valueOf(n);
    for (long k = 0; k <= mN; ++k) {
      if (t.add(1).isProbablePrime()) {
        return false;
      }
      t = t.multiply2();
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
