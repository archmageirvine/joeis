package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A073116 Continued fraction expansion of S/2 where S = Sum_{k&gt;=0} 1/2^floor(k*phi) (A073115) and phi is the golden ratio (1+sqrt(5))/2 (A001622).
 * If n&gt;2 a(2n+1)=2^(F(2n-1)+1), a(2n)= 2^(F(2n-2)-1) where F(n) is the n-th Fibonacci number
 * @author Georg Fischer
 */
public class A073116 extends A000045 {

  {
    setOffset(1);
  }

  private static final int[] INITS = {0, 1, 5, 1};
  private int mN;

  /** Construct the sequence. */
  public A073116() {
    mN = 0;
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 4) {
      return Z.valueOf(INITS[mN - 1]);
    }
    return Z.ONE.shiftLeft(super.next().intValue() + (((mN & 1) == 1) ? 1 : -1));
  }
}
