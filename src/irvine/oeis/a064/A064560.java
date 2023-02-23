package irvine.oeis.a064;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064560 Numbers n such that reciprocal of n terminates with an infinite repetition of digit 1. Multiples of 10 are omitted.
 * @author Georg Fischer
 */
public class A064560 extends Sequence1 {

  private int mN2;
  private int mN5;
  private final Function<Integer, Z> mLambda2;
  private final Function<Integer, Z> mLambda5;
  private Z mA2;
  private Z mA5;

  /** Construct the sequence. */
  public A064560() {
    this(0, i -> Z.ONE.shiftLeft(6 * i).multiply(Z.NINE), i -> Z.FIVE.pow(6 * i).multiply(Z.NINE));
  }

  /**
   * Generic constructor with parameters
   * @param start first value of <code>i</code>
   * @param lambda2 expression for the first sequence
   * @param lambda5 expression for the second sequence
   */
  public A064560(final int start, final Function<Integer, Z> lambda2, final Function<Integer, Z> lambda5) {
    mN2 = start - 1;
    mN5 = start - 1;
    mLambda2 = lambda2;
    mLambda5 = lambda5;
    mA2 = mLambda2.apply(++mN2);
    mA5 = mLambda5.apply(++mN5);
  }

  @Override
  public Z next() {
    Z result = mA2;
    final int sign = mA2.compareTo(mA5);
    if (sign < 0) {
      mA2 = mLambda2.apply(++mN2);
    } else if (sign == 0) {
      mA2 = mLambda2.apply(++mN2);
      mA5 = mLambda5.apply(++mN5);
    } else {
      result = mA5;
      mA5 = mLambda5.apply(++mN5);
    }
    return result;
  }
}
