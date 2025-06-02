package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011950 Number of Barlow packings with group P3(bar)m1(SO) that repeat after 2n-1 layers.
 * @author Sean A. Irvine
 */
public class A011950 extends A011954 {

  // After R. J. Mathar

  private long mN = 0;

  /** Construct the sequence. */
  public A011950() {
    super(1);
  }

  @Override
  public Z next() {
    final long pLim = 2 * ++mN - 1;
    Z sum = Z.ZERO;
    for (long q = 0; q < pLim; ++q) {
      final long p = pLim - q;
      if (p <= q && (p - q) % 3 == 0) {
        sum = sum.add(bt(p, q));
      }
    }
    return sum;
  }
}
