package irvine.oeis.a299;
// Generated by gen_seq4.pl A255961/adsums

import irvine.math.z.Z;
import irvine.oeis.a255.A255961;

/**
 * A299166 Expansion of 1/(1 - x*Product_{k&gt;=1} 1/(1 - x^k)^k).
 * @author Georg Fischer
 */
public class A299166 extends A255961 {

  private int mN = -1;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int j = 0; j <= mN; ++j) {
      sum = sum.add(super.matrixElement(mN - j, j));
    }
    return sum;
  }
}

