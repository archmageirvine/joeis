package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077564.
 * @author Sean A. Irvine
 */
public class A077567 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma = Functions.SIGMA1.z(++mN);
    long k = 1;
    Z nk = Z.valueOf(mN);
    while (true) {
      ++k;
      nk = nk.multiply(mN);
      if (Functions.SIGMA1.z(nk).mod(sigma).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
