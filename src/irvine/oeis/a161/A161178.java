package irvine.oeis.a161;

import java.util.function.Function;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A161178 Sum of the double factorials of the digits of n.
 * @author Georg Fischer
 */
public class A161178 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final Function<Long, Z> mLambda;

  /** Construct the sequence. */
  public A161178() {
    this(0, n -> Functions.MULTIFACTORIAL.z(2, n));
  }

  /**
   * Generic constructor with parameters:
   * Compute a sum over some function applied to all digits of n.
   * @param offset first index
   * @param lambda function to be applied to the digits of n
   */
  public A161178(final int offset, final Function<Long, Z> lambda) {
    super(offset);
    mN = offset - 1;
    mLambda = lambda;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z m = n;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(mLambda.apply(m.mod(10)));
      m = m.divide(10);
    } while (!m.isZero());
    return sum;
  }

  @Override
  public Z a(final long n) {
    long m = n;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(mLambda.apply(m % 10));
      m /= 10;
    } while (m != 0);
    return sum;
  }

}

