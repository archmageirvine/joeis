package irvine.oeis.a196;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A196498 Decimal expansion of the constant Sum_{k&gt;=0} (-1)^k/(10*k)!.
 * @author Sean A. Irvine
 */
public class A196498 extends DecimalExpansionSequence {

  private static final int EXTRA_PRECISION = 5;

  protected A196498(final long stride) {
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
          sum = sum.signedAdd((k & 1) == 0, fk);
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
  public A196498() {
    this(10);
  }
}
