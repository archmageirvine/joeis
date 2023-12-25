package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A341480 Number of ways to write n as an ordered sum of 3 nonprime numbers.
 * @author Georg Fischer
 */
public class A341480 extends MemoryFunctionInt2Sequence<Z> {

  private int mN;
  private int mParts;
  private int mDist;

  /** Construct the sequence. */
  public A341480() {
    this(3, 3, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parts number of parts
   * @param dist 1 for distinct parts, 0 otherwise
   */
  public A341480(final int offset, final int parts, final int dist) {
    super(offset);
    mN = offset - 1;
    mParts = parts;
    mDist = dist;
  }

  /* Maple:
    b:= proc(n, t) option remember;
          `if`(n=0, `if`(t=0, 1, 0), `if`(t<1, 0, add(
          `if`(isprime(j), 0, b(n-j, t-1)), j=1..n)))
        end:
    a:= n-> b(n, 3):
  */
  @Override
  protected Z compute(final int n, final int t) {
    if (n == 0) {
      return (t == 0) ? Z.ONE : Z.ZERO;
    }
    if (t < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= n; ++j) {
      if (!Z.valueOf(j).isProbablePrime()) {
        sum = sum.add(get(n - j, t - 1));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mParts);
  }
}
