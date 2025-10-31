package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081471 a(n) = A081470(n)/n.
 * @author Sean A. Irvine
 */
public class A081471 extends Sequence1 {

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
    return prod.divide(mN);
  }
}
