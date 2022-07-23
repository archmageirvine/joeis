package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033307;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A058068 Denominators of convergents to Champernowne constant (A033307).
 * @author Sean A. Irvine
 */
public class A058068 extends ContinuedFractionDenominatorSequence {

  static final CR CHAMPERKNOWNE_CONSTANT = new CR() {
    private final Sequence mChamperknowne = new A033307();
    private Z mA = Z.ZERO;
    private Z mB = Z.ONE;

    @Override
    protected Z approximate(final int precision) {
      while (mA.bitLength() <= -precision) {
        mA = mA.multiply(10).add(mChamperknowne.next());
        mB = mB.multiply(10);
      }
      return scale(mA, -precision).divide(mB);
    }
  };

  /** Construct the sequence. */
  public A058068() {
    super(new DecimalExpansionSequence(CHAMPERKNOWNE_CONSTANT));
  }
}
