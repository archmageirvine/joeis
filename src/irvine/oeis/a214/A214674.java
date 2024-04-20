package irvine.oeis.a214;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A214674 Conway's subprime Fibonacci sequence.
 * @author Georg Fischer
 */
public class A214674 extends AbstractSequence {

  private int mN;
  private Z mA1;
  private Z mA2;

  /** Construct the sequence. */
  public A214674() {
    this(0, 1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param a1 value of a(1)
   * @param a2 value of a(2)
   */
  public A214674(final int offset, final int a1, final int a2) {
    super(offset);
    mN = 0;
    mA1 = Z.valueOf(a1);
    mA2 = Z.valueOf(a2);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA1;
    }
    if (mN == 2) {
      return mA2;
    }
    Z result = mA1.add(mA2);
    if (!result.isProbablePrime()) {
      result = result.divide(Functions.LPF.z(result));
    }
    mA1 = mA2;
    mA2 = result;
    return result;
  }
}
