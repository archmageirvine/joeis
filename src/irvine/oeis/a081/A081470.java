package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081470 Smallest product (n+1)(n+2)...(n+k) which is a multiple of n, where n+k is given by A061243.
 * @author Sean A. Irvine
 */
public class A081470 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    long pr = 1; // == prod (mod mN)
    long k = mN;
    do {
      prod = prod.multiply(++k);
      pr *= k;
      pr %= mN;
    } while (pr != 0);
    return prod;
  }
}
