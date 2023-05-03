package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063528 Smallest number such that it and its successor are both divisible by an n-th power larger than 1.
 * @author Sean A. Irvine
 */
public class A063528 extends Sequence1 {

  // After Franklin T. Adams-Watters

  private long mN = 0;
  private Z mT = Z.ONE;

  private Z b(final long n, final Z p, final Z q) {
    final Z qn = q.pow(n);
    final Z i = p.modInverse(qn).modPow(Z.valueOf(n), qn);
    final Z pn = p.pow(n);
    return pn.multiply(i).subtract(1).min(pn.multiply(qn.subtract(i)));
  }

  @Override
  public Z next() {
    final Z r = b(++mN, Z.TWO, Z.THREE);
    mT = mT.multiply(5);
    return r.compareTo(mT) > 0 ? r.min(b(mN, Z.TWO, Z.FIVE).min(b(mN, Z.THREE, Z.FIVE))) : r;
  }
}
