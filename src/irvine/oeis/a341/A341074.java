package irvine.oeis.a341;

import irvine.math.LongUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A341074 Number of partitions of n into 5 distinct squarefree parts.
 * @author Georg Fischer
 */
public class A341074 implements SequenceWithOffset {

  private int mN;
  private final int mOffset;
  private final int mNpart;

  /** Construct the sequence. */
  public A341074() {
    this(17, 5);
  }

  /**
   * Generic constructor with parameter
   * @param npart number of parts
   */
  public A341074(final int offset, final int npart) {
    mOffset = offset;
    mNpart = npart;
    mN = offset - 1;
  }

  /* Maple:
    b:= proc(n, i, t) option remember; `if`(n=0,
          `if`(t=0, 1, 0), `if`(i<1 or t<1, 0, b(n, i-1, t)+
          `if`(numtheory[issqrfree](i), b(n-i, min(n-i, i-1), t-1), 0)))
        end:
    a:= n-> b(n$2, 5):
    seq(a(n), n=17..77);  # _Alois P. Heinz_, Feb 04 2021
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (n == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      }
      if (i < 1 || t < 1) {
        return Z.ZERO;
      }
      Z sum = get(n, i - 1, t);
      if (LongUtils.isSquareFree(i)) {
        final int ni = n - i;
        sum = sum.add(get(ni, Math.min(ni, i - 1), t - 1));
      }
      return sum;
    }
  };

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mN, mNpart);
  }
}
