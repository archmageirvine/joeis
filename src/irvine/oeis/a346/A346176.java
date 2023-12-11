package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a205.A205083;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346176 Decimal expansion of A205083 read as a binary fraction.
 * @author Sean A. Irvine
 */
public class A346176 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346176() {
    super(1, new CR() {

      private final Sequence mS = new A205083();
      private Z mA = mS.next();

      @Override
      protected Z approximate(final int precision) {
        while (mA.bitLength() <= -precision + 1) {
          mA = mA.multiply2().add(mS.next());
        }
        return mA.shiftRight(mA.bitLength() + precision - 1);
      }
    });
  }
}
