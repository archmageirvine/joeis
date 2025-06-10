package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384443 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A384443 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    long m = ++mN;
    while (m != 0) {
      final long r = m % 10;
      if (r == 2 || r == 3 || r == 5 || r == 7) {
        prod = prod.multiply(r);
      }
      m /= 10;
    }
    return prod;
  }
}
