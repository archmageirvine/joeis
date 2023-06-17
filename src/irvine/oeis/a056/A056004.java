package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056004 Initial step in Goodstein sequences: write n in hereditary representation base 2, bump to base 3, then subtract 1.
 * @author Sean A. Irvine
 */
public class A056004 extends AbstractSequence {

  /** Construct the sequence. */
  public A056004() {
    super(1);
  }

  private long mN = 0;

  protected Z code(final Z n, final int base) {
    Z sum = Z.ZERO;
    Z m = n;
    int k = 0;
    while (!m.isZero()) {
      final long r = m.mod(base);
      if (r != 0) {
        final Z zk = Z.valueOf(k);
        sum = sum.add(Z.valueOf(base + 1).pow(k < base ? zk : code(zk, base).add(1)).multiply(r));
      }
      m = m.divide(base);
      ++k;
    }
    return sum.subtract(1);
  }

  @Override
  public Z next() {
    return code(Z.valueOf(++mN), 2);
  }
}
