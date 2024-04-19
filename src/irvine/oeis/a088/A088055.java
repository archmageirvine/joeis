package irvine.oeis.a088;
// manually anopan 

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A088055 a(n) = n!*n^n - ((n^(n+1)-1)/(n-1) - 1) for n&gt;1 with a(1)=0.
 * @author Georg Fischer
 */
public class A088055 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return (mN == 1) ? Z.ZERO : n.pow(mN + 1).subtract(1).divide(mN - 1).subtract(1).subtract(Functions.FACTORIAL.z(mN).multiply(n.pow(mN))).negate();
  }
}
