package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A066716 Decimal expansion of the binary Champernowne constant 0.862240125868... whose binary expansion is the concatenation of 1, 2, 3, ... written in binary.
 * @author Sean A. Irvine
 */
public class A066716 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A066716() {
    super(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        final StringBuilder s = new StringBuilder();
        long k = 0;
        while (s.length() < -precision) {
          s.append(Long.toBinaryString(++k));
        }
        return new Z(s, 2).shiftRight(s.length() + precision);
      }
    });
  }
}
