package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036831 Schoenheim bound L_1(n, 4, 3).
 * @author Sean A. Irvine
 */
public class A036831 extends AbstractSequence {

  /** Construct the sequence. */
  public A036831() {
    super(4);
  }

  private long mN = 3;

  protected Z l(final long v, final long k, final long t, final long l) {
    Z t1 = Z.valueOf(l);
    for (long i = v - t + 1; i <= v; ++i) {
      final long u = i - v + k;
      t1 = t1.multiply(i).add(u - 1).divide(u);
    }
    return t1;
  }

  @Override
  public Z next() {
    return l(++mN, 4, 3, 1);
  }
}
