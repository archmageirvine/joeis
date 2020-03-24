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

  private static final CR CHAMPERKNOWNE = new CR() {

    private final Sequence mDigits = new A033307();
    private Z mUnscaled = Z.ZERO;
    private Z mPowersOfTen = Z.ONE;

    @Override
    protected Z approximate(final int p) {
      if (p >= 1) {
        return Z.ZERO;
      }
      while (mUnscaled.bitLength() <= -p) {
        mUnscaled = mUnscaled.multiply(10).add(mDigits.next());
        mPowersOfTen = mPowersOfTen.multiply(10);
      }
      // This is a little bit circuitous but seems to work reliably
      return CR.valueOf(new Q(mUnscaled, mPowersOfTen)).shiftLeft(-p).toZ();
    }
  };

  /** Construct the sequence. */
  public A030167() {
    super(new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return CHAMPERKNOWNE;
      }
    });
  }
}
