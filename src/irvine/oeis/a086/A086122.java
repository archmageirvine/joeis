package irvine.oeis.a086;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A086122 Primes of the form (5^k-1)/4.
 * @author Georg Fischer
 */
public class A086122 extends AbstractSequence {

  private int mN;
  private Function<Integer, Z> mLambda;
  private long mDiv;

  /** Construct the sequence. */
  public A086122() {
    this(1, k -> Z.FIVE.pow(k).subtract(1), 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param lambda expression for the numerator
   * @param div denominator
   */
  public A086122(final int offset, final Function<Integer, Z> lambda, final long div) {
    super(offset);
    mN = -1;
    mLambda = lambda;
    mDiv = div;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z[] quot = mLambda.apply(mN).divideAndRemainder(mDiv);
      if (quot[1].isZero() && quot[0].compareTo(Z.ZERO) > 0 && quot[0].isProbablePrime()) {
        return quot[0];
      }
    }
  }
}
