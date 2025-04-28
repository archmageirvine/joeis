package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.OtterConstants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005200;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A051496 Decimal expansion of the probability that a point of an infinite (rooted) tree is fixed by every automorphism of the tree.
 * @author Sean A. Irvine
 */
public class A051496 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051496() {
    super(0, new CR() {
      private final OtterConstants mOtter = new OtterConstants();
      private final CR mEta = mOtter.alpha().inverse();
      private final CR mEtaSquared = mEta.square();
      private final CR mB1Squared = mOtter.gamma().square();
      private final CR mScale = CR.TWO.divide(mEta.multiply(mB1Squared));

      @Override
      protected Z approximate(final int precision) {
        final Sequence f = new A005200();
        Z sum = mScale.getApprox(precision); // 1 in 1-F(eta^2)
        int k = 0;
        while (true) {
          ++k;
          final Z fk = f.next();
          final Z t = mEtaSquared.pow(k).multiply(fk).multiply(mScale).getApprox(precision);
          if (t.isZero()) {
            return sum;
          }
          sum = sum.subtract(t);
        }
      }
    });
  }
}

