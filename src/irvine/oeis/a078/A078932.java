package irvine.oeis.a078;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A078932 Number of compositions (ordered partitions) of n into powers of 3.
 * @author Georg Fischer
 */
public class A078932 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A078932() {
    super(0);
    mN = -1;
  }

  /* Maple:
     a:= proc(n) option remember;
       `if`(n=0, 1, add(a(n-3^i), i=0..ilog[3](n)))
     end:
     seq(a(n), n=0..50);
  */
  private final MemoryFunction1<Z> mF = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      int powk = 1;
      while (powk <= n) {
        sum = sum.add(get(n - powk));
        powk *= 3;
      }
      return sum;
    }
  };

  @Override
  public Z a(final int n) {
    return mF.get(n);
  }

  @Override
  public Z a(final Z n) {
    return mF.get(n.intValueExact());
  }

  @Override
  public Z next() {
    return mF.get(++mN);
  }
}
