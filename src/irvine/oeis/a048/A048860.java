package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048860 Smallest denominator d such that the Sylvester expansion of n/d has n terms.
 * @author Sean A. Irvine
 */
public class A048860 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z q = Z.valueOf(mN + 1);
    while (true) {
      long c = 1;
      Z bigP = Z.valueOf(mN);
      Z bigQ = q;
      while (!bigQ.mod(bigP).isZero()) {
        final Z d = bigQ.divide(bigP).add(1);
        bigP = bigP.multiply(d).subtract(bigQ);
        bigQ = bigQ.multiply(d);
        ++c;
      }
      if (c == mN) {
        return q;
      }
      q = q.add(mN);
    }
  }
}
