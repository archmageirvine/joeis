package irvine.oeis.a056;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a033.A033307;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A056029 Champernowne's constant in base 2.
 * @author Sean A. Irvine
 */
public class A056029 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A056029() {
    super(0, new CR() {
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
    }, 2);
  }
}
