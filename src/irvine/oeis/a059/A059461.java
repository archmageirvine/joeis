package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059461 Numbers which are the sum of their proper divisors containing the digit 0.
 * @author Sean A. Irvine
 */
public class A059461 extends Sequence1 {

  private final int mBit;
  private long mN = 0;

  protected A059461(final int digit) {
    mBit = 1 << digit;
  }

  /** Construct the sequence. */
  public A059461() {
    this(0);
  }

  @Override
  public Z next() {
    while (true) {
      long sum = 0;
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        if ((Functions.SYNDROME.i(d) & mBit) != 0 && d.longValue() != mN) {
          sum += d.longValue();
        }
      }
      if (sum == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
