package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a045.A045683;

/**
 * A011952 Number of Barlow packings with group P3(bar)m1(O) that repeat after 2n layers.
 * @author Sean A. Irvine
 */
public class A011952 extends A011955 {

  // After R. J. Mathar

  private final DirectSequence mA045683 = DirectSequence.create(new A045683());
  private int mN = 3;

  /** Construct the sequence. */
  public A011952() {
    super(4);
  }

  private Z fracS(final int phalf) {
    return (phalf & 1) == 0 ? tt(phalf, phalf).divide2() : tt(phalf, phalf).subtract(mA045683.a(phalf)).divide2();
  }

  @Override
  public Z next() {
    final long pLim = 2L * ++mN;
    Z sum = fracS(mN);
    for (long q = 0; q < pLim; ++q) {
      final long p = pLim - q;
      if (p < q && (p - q) % 3 == 0) {
        sum = sum.add(tt(p, q));
      }
    }
    return sum;
  }
}
