package irvine.oeis.a328;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A328988 Number of partitions of n with rank a multiple of 3..
 * @author Georg Fischer
 */
public class A328988 extends MemoryFunctionInt3Sequence<Z> {

  private int mN;
  private Function<Integer, Boolean> mRank;

  /** Construct the sequence. */
  public A328988() {
    this(1, r -> r % 3 == 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param rank rank must be a multiple of this number
   */
  public A328988(final int offset, final Function<Integer, Boolean> rank) {
    super(offset);
    mN = offset - 1;
    mRank = rank;
  }

  /* Maple:
    b:= proc(n, i, c) option remember; `if`(i>n, 0, `if`(i=n,
         `if`(irem(i-c, 7)=0, 1, 0), b(n-i, i, c+1)+b(n, i+1, c)))
        end:
    a:= n-> b(n, 1$2): # A363239
  */
  @Override
  protected Z compute(final int n, final int i, final int c) {
    if (i > n) {
      return Z.ZERO;
    }
    if (i == n) {
      return mRank.apply(i - c) ? Z.ONE : Z.ZERO;
    }
    return get(n - i, i, c + 1).add(get(n, i + 1, c));
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, 1, 1);
  }
}
