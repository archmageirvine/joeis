package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069537 Multiples of 2 whose digit sum is 2.
 * @author Georg Fischer
 */
public class A069537 extends Sequence1 {

  private Z mN;
  private final int mBase;
  private final int mSum;

  /** Construct the sequence. */
  public A069537() {
    this(2, 2);
  }

  /**
   * Generic constructor with parameters
   * @param base multiples of this base
   * @param sum desired digit sum
   */
  public A069537(final int base, final int sum) {
    mN = Z.ZERO;
    mBase = base;
    mSum = sum;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(mBase);
      if (Functions.DIGIT_SUM.l(mN) == mSum) {
        return mN;
      }
    }
  }
}
