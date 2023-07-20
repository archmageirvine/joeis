package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A151843 a(0)=0; a(1)=0; a(2)=0; for n&gt;=3 if n=2^i + j with 0&lt;=j&lt;2^i then a(n)=a(j) + a(j + 1) except we add 1 if j=2^i-1.
 * @author Georg Fischer
 */
public class A151843 extends MemorySequence {

  protected int[] mInits;
  protected int mFaj0;
  protected int mFaj1;

  /** Construct the sequence. */
  public A151843() {
    this(0, 0, 0, 1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param inits 3 initial terms and 2 factors for a(j), a(j+1)
   */
  public A151843(final int... inits) {
    mInits = inits;
    mFaj0 = mInits[3];
    mFaj1 = mInits[4];
  }

  /* Maple:
  f:= proc(n) option remember; local i, j;
    i:= ilog2(n);
    j:= n - 2^i;
    print(n,i,j);
    if j = 2^i-1 then procname(j)+procname(j+1)+1 else procname(j)+procname(j+1) fi
  end proc:
  */
  @Override
  public Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(mInits[n]);
    }
    final int pow2 = Integer.highestOneBit(n);
    final int j = n - pow2;
    Z result = a(j).multiply(mFaj0).add(a(j + 1).multiply(mFaj1));
    if (j == pow2 - 1) {
      result = result.add(1);
    }
    return result;
  }
}
