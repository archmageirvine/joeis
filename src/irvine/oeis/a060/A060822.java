package irvine.oeis.a060;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060822 a(n) = prime(n) + n^3 + n^2 + 4n - 1.
 * @author Georg Fischer
 */
public class A060822 extends A000040 {

  protected BiFunction<Integer, Integer, Z> mLambda;
  protected int mN;

  /** Construct the sequence. */
  public A060822() {
    this(1, (n, p) -> Z.valueOf(p).add(Z.valueOf(n).pow(3)).add(Z.valueOf((long) n * n + 4L * n - 1)));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param lambda lambda expression for the number derived from the prime
   */
  public A060822(final int offset, final BiFunction<Integer, Integer, Z> lambda) {
    setOffset(offset);
    mN = 0;
    while (mN + 1 < offset) {
      ++mN;
      super.next();
    }
    mLambda = lambda;
  }

  @Override
  public Z next() {
    ++mN;
    final int p = super.next().intValue();
    return mLambda.apply(mN, p);
  }
}
