package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033307;

/**
 * A030167 Continued fraction expansion of the Champernowne constant 0.1234567891011121314...
 * @author Sean A. Irvine
 */
public class A030167 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A030167() {
    super(new DecimalExpansionSequence() {

      private final Sequence mChamperknowne = new A033307();
      private CR mA = CR.ZERO;
      private Z mNum = Z.ZERO;
      private Z mDen = Z.ONE;

      @Override
      protected void ensureAccuracy(final int n) {
        while (mNum.bitLength() < 1000 * n) { // Hacky heuristic -- this is dubious!
          mNum = mNum.multiply(10).add(mChamperknowne.next());
          mDen = mDen.multiply(10);
        }
        mA = CR.valueOf(new Q(mNum, mDen));
      }

      @Override
      protected CR getCR() {
        return mA;
      }
    });
  }
}
