package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011954 Barlow packings with group R3(bar)m(SO) that repeat after 6n+3 layers.
 * @author Sean A. Irvine
 */
public class A011954 extends AbstractSequence {

  // After R. J. Mathar

  private long mN = -1;

  protected A011954(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A011954() {
    this(0);
  }

  protected Z b(final long p, final long q) {
    Z sum = Z.ZERO;
    for (long d = 1; d <= Math.min(p, q); ++d) {
      if (p % d == 0 && q % d == 0) {
        final long ph = p / 2 / d;
        final long qh = q / 2 / d;
        sum = sum.add(Binomial.binomial(ph + qh, ph).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum;
  }

  protected Z bt(final long p, final long q) {
    return ((p + q) & 1) == 1 ? b(p, q) : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else {
      final long pLim = 2 * mN + 1;
      Z sum = Z.ZERO;
      for (long q = 0; q <= pLim; ++q) {
        final long p = pLim - q;
        if (p < q && (p - q) % 3 != 0) {
          sum = sum.add(bt(p, q));
        }
      }
      return sum;
    }
  }
}
