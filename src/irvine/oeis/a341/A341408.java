package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A341408 Number of partitions of n into 3 nonprime parts.
 * @author Georg Fischer
 */
public class A341408 extends MemoryFunctionInt3Sequence<Z> {

  private int mN;
  private final int mParts;
  private final int mDist;

  /** Construct the sequence. */
  public A341408() {
    this(3, 3, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parts number of parts
   * @param dist 1 for distinct parts, 0 otherwise
   */
  public A341408(final int offset, final int parts, final int dist) {
    super(offset);
    mN = offset - 1;
    mParts = parts;
    mDist = dist;
  }

  /* Maple:
    b:= proc(n, i, t) option remember; `if`(n=0,
          `if`(t=0, 1, 0), `if`(i<1 or t<1, 0, b(n, i-1, t)+
          `if`(isprime(i), 0, b(n-i, min(n-i, i), t-1))))
        end:
    a:= n-> b(n, n, 3):
  */
  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (n == 0) {
      return (t == 0) ? Z.ONE : Z.ZERO;
    }
    if (i < 1 || t < 1) {
      return Z.ZERO;
    }
    Z result = get(n, i - 1, t);
    if (!Z.valueOf(i).isProbablePrime()) {
      result = result.add(get(n - i, (n - i < i - mDist) ? n - i : i - mDist, t - 1));
    }
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN, mParts);
  }
}
