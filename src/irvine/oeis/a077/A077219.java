package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077219 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    int cnt = 1;
    for (long k = 2; k < mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1) {
        prod = prod.multiply(k);
        ++cnt;
      }
    }
    return prod.root(cnt);
  }
}

