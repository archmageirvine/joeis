package irvine.oeis.a240;

import irvine.math.z.Z;
import irvine.oeis.memory.FunctionInt3ZSequence;

/**
 * A240138 Number of partitions of n into distinct parts, where the difference between the number of odd parts and the number of even parts is 2.
 * where the difference between the number of odd parts and the number of even parts is 2.
 * @author Georg Fischer
 */
public class A240138 extends FunctionInt3ZSequence {

  protected int mDiff;
  protected int mN;

  /** Construct the sequence. */
  public A240138() {
    this(4, 2);
  }

  /**
   * Constructor with parameters.
   * @param offset first index
   * @param diff difference
   */
  public A240138(final int offset, final int diff) {
    super(offset);
    mN = offset - 1;
    mDiff = diff;
  }

  /* Maple programs:
    b:= proc(n, i, t) option remember; `if`(n>i*(i+1)/2 or
      abs(t)>n, 0, `if`(n=0, 1, b(n, i-1, t)+
      `if`(i>n, 0, b(n-i, i-1, t+(2*irem(i, 2)-1)))))
    end:
    a:= n-> b(n$2, -2): seq(a(n), n=4..80);
  */
  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (n > i * (i + 1) / 2 || Math.abs(t) > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    return get(n, i - 1, t).add(i > n ? Z.ZERO : get(n - i, i - 1, t + 2 * (i & 1) - 1));
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN, -mDiff);
  }
}
