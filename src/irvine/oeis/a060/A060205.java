package irvine.oeis.a060;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060205 (p^p)^p, where p is prime(n).
 * @author Georg Fischer
 */
public class A060205 extends A000040 {

  protected Function<Integer, Z> mLambda;

  /** Construct the sequence. */
  public A060205() {
    this(p -> Z.valueOf(p).pow(p).pow(p));
  }

  /**
   * Generic constructor with parameters
   * @param lambda lambda expression for the number derived from the prime
   */
  public A060205(final Function<Integer, Z> lambda) {
    mLambda = lambda;
  }

  @Override
  public Z next() {
    final int p = super.next().intValue();
    return mLambda.apply(p);
  }
}
