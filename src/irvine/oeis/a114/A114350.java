package irvine.oeis.a114;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A114350 Primes of the form 2x^3 + x + 1.
 * @author Georg Fischer
 */
public class A114350 extends AbstractSequence {

  private final Function<Z, Z> mLambda; // lambda expression in x
  private Z mX;

  /** Construct the sequence. */
  public A114350() {
    this(1, 1, x -> x.pow(3).multiply(2).add(x).add(1));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start frst value of x
   * @param lambda expression in x
   */
  public A114350(final int offset, final int start, final Function<Z, Z> lambda) {
    super(offset);
    mLambda = lambda;
    mX = Z.valueOf(start - 1);
  }

  @Override
  public Z next() {
    while (true) {
      mX = mX.add(1);
      final Z result = mLambda.apply(mX);
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
