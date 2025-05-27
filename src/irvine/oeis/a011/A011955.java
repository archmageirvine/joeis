package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A011955 Number of Barlow packings with group R3(bar)m(O) that repeat after 6n layers.
 * @author Sean A. Irvine
 */
public class A011955 extends A011954 {

  // After R. J. Mathar

  private long mN = 1;

  protected A011955(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A011955() {
    this(2);
  }

  private Z bbtemp(final long p, final long q) {
    Z sum = Z.ZERO;
    for (long d = 1; d <= Math.min(p, q); ++d) {
      if (p % (2 * d) == 0 && q % (2 * d) == 0) {
        final long ph = p / (2 * d);
        final long qh = q / (2 * d);
        sum = sum.add(Binomial.binomial(ph + qh, ph).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum;
  }

  protected Z bb(final long p, final long q) {
    return (p & 1) == 0 && (q & 1) == 0 ? bbtemp(q, p).subtract(bt(p / 2, q / 2)).divide2() : Z.ZERO;
  }

  protected Z tt(final long p, final long q) {
    return ((p + q) & 1) == 1 ? Z.ZERO : b(p, q).subtract(bb(p, q));
  }

  @Override
  public Z next() {
    final long pLim = 2 * ++mN;
    Z sum = Z.ZERO;
    for (long q = 0; q < pLim; ++q) {
      final long p = pLim - q;
      if (p < q && (p - q) % 3 != 0) {
        sum = sum.add(tt(p, q));
      }
    }
    return sum;
  }

}
