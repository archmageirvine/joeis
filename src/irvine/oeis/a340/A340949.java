package irvine.oeis.a340;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A340949 Number of ways to write n as an ordered sum of 4 nonzero triangular numbers.
 * @author Georg Fischer
 */
public class A340949 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private int mNpart;

  /** Construct the sequence. */
  public A340949() {
    this(4, 4);
  }

  /**
   * Generic constructor with parameter
   * @param npart number of parts
   */
  public A340949(final int offset, final int npart) {
    mOffset = offset;
    mNpart = npart;
    mN = offset - 1;
  }

  /* Maple:
    b:= proc(n, k) option remember; local r, t, d; r, t, d:= $0..2;
          if n=0 then `if`(k=0, 1, 0) else
          while t<=n do r:= r+b(n-t, k-1); t, d:= t+d, d+1 od; r fi
        end:
    a:= n-> b(n, 4):
    seq(a(n), n=4..75);  # _Alois P. Heinz_, Jan 31 2021
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      Z r = Z.ZERO;
      int t = 1;
      int d = 2;
      while (t <= n) {
        r = r.add(get(n - t, k - 1));
        t = t + d;
        d++;
      }
      return r;
    }
  };

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mNpart);
  }
}
