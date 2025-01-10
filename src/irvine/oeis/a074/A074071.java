package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014578;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074071 Decimal expansion of Thue constant.
 * @author Sean A. Irvine
 */
public class A074071 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074071() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z res = Z.ZERO;
        final Sequence seq = new A014578();
        // Note precision is negative
        for (int k = 0; k >= precision; --k) {
          res = res.multiply2().add(seq.next());
        }
        return res;
      }
    });
  }
}
