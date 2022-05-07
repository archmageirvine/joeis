package irvine.oeis.a239;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A239240 Number of partitions of n into distinct parts for which (number of odd parts) &lt;= (number of even parts).
 * @author Georg Fischer
 */
public class A239240 extends MemoryFunctionInt3<Z> implements Sequence {

  protected int mCond;
  protected int mN;

  /** Construct the sequence. */
  public A239240() {
    this(0, 1);
  }

  /**
   * Constructor with parameters.
   * @param offset first index
   * @param cond code for condition 1: &lt;=0, 2: ==0, 3: &gt;0, 4: &gt;=0
   */
  public A239240(final int offset, final int cond) {
    mN = offset - 1;
    mCond = cond;
  }

  /* Maple programs:
    b:= proc(n, i, t) option remember; `if`(n>i*(i+1)/2, 0,
         `if`(n=0, `if`(t<=0, 1, 0 ), b(n, i-1, t)+`if`(i>n, 0,
          b(n-i, i-1, t+`if`(irem(i, 2)=1, 1, -1)))))
        end:
    a:= n-> b(n$2, 0):
    seq(a(n), n=0..60);  # _Alois P. Heinz_, Mar 15 2014
  */
  @Override
  protected Z compute(final int n, final int i, final int t) {
    if (n > i * (i + 1) / 2) {
      return Z.ZERO;
    }
    if (n == 0) {
      switch (mCond) {
        case 2:
          return t == 0 ? Z.ONE : Z.ZERO;
        case 3:
          return t > 0 ? Z.ONE : Z.ZERO;
        case 4:
          return t >= 0 ? Z.ONE : Z.ZERO;
        case 1:
        default:
          return t <= 0 ? Z.ONE : Z.ZERO;
      }
    }
    return get(n, i - 1, t).add(i > n ? Z.ZERO : get(n - i, i - 1, t + (((i & 1) == 1 ? 1 : -1))));
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN, 0);
  }
}
