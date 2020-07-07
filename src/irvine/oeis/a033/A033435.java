package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.Sequence;

/**
 * A033435 Continued fraction for Champernowne constant <code>= 0.01234567891011121314..</code>.
 * @author Sean A. Irvine
 */
public class A033435 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A033435() {
    super(new DecimalExpansionSequence() {

      private final Sequence mChamperknowne = new A033307();
      private CR mA = CR.ZERO;
      private Z mNum = Z.ZERO;
      private Z mDen = Z.TEN;

      @Override
      protected void ensureAccuracy(final int n) {
        while (mNum.bitLength() < 4 * n) { // 4 > log2(10)
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
