package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a023.A023532;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060625 Decimal representation if A023532 is binary.
 * @author Sean A. Irvine
 */
public class A060625 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A060625() {
    super(new CR() {

      private final Sequence mS = new A023532();
      private Z mA = Z.ZERO;

      @Override
      protected Z approximate(final int precision) {
        while (mA.bitLength() < -precision) {
          mA = mA.multiply2();
          mA = mA.add(mS.next());
        }
        return mA;
      }
    });
  }
}
