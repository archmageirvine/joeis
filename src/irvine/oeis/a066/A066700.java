package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a067.A067103;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A066700 The leading digits in the terms in A067103 converge; dividing by a suitable power of 10 they converge to the number shown below; sequence gives continued fraction for this number.
 * @author Sean A. Irvine
 */
public class A066700 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A066700() {
    super(1, new DecimalExpansionSequence(new CR() {
      private final Sequence mSeq = new A067103();
      private Z mA = mSeq.next();
      private Z mB = mSeq.next();
      private Z mT = Z.ONE;

      @Override
      protected Z approximate(final int precision) {
        final int p = -precision;
        while (mA.bitLength() < p) {
          mA = mB;
          mB = mSeq.next();
        }
        while (mA.shiftRight(mA.bitLength() - p).equals(mB.shiftRight(mB.bitLength() - p))) {
          mA = mB;
          mB = mSeq.next();
        }
        while (mB.compareTo(mT.multiply(10)) >= 0) {
          mT = mT.multiply(10);
        }
        return CR.valueOf(new Q(mB, mT)).getApprox(precision);
      }
    }));
  }
}
