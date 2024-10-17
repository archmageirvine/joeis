package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.EgyptianFractionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a010.A010051;

/**
 * A036680 Expansion of C in Egyptian fractions, where C contains the primes in binary.
 * @author Sean A. Irvine
 */
public class A036680 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A036680() {
    super(new CR() {
      private final Sequence mCharacteristicPrimes = new A010051();
      private Z mA = Z.ZERO;
      private int mPrecision = 0;

      @Override
      protected Z approximate(final int precision) {
        while (-precision > mPrecision) {
          mA = mA.multiply2().add(mCharacteristicPrimes.next());
          ++mPrecision;
        }
        return mA;
      }
    });
  }
}
