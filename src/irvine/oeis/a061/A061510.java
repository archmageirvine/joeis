package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061510 Write n in decimal, omit 0's, raise each digit k to k-th power and multiply.
 * @author Sean A. Irvine
 */
public class A061510 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    while (m != 0) {
      final long v = m % 10;
      prod = prod.multiply(LongUtils.pow(v, v));
      m /= 10;
    }
    return prod;
  }
}

