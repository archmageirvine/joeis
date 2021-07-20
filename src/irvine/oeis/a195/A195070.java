package irvine.oeis.a195;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A195070 Sum_{k&gt;=0} 1/(10k)!.
 * @author Sean A. Irvine
 */
public class A195070 extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 5;

  protected A195070(final long stride) {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        final int p = EXTRA_PRECISION - precision;
        Z sum = Z.ZERO;
        Z fk = Z.ONE.shiftLeft(p);
        long k = 0;
        long m = 1;
        do {
          sum = sum.add(fk);
          ++k;
          while (m <= stride * k) {
            fk = fk.divide(m++);
          }
        } while (!fk.isZero());
        return sum.shiftRight(EXTRA_PRECISION);
      }
    });
  }

  /** Construct the sequence. */
  public A195070() {
    this(10);
  }
}
