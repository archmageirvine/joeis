package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076041 a(n) = n! for n &lt; 4; else a(n) = floor(P(n-1)/n) where P(n) = a(1) * a(2) * ... * a(n).
 * @author Sean A. Irvine
 */
public class A076041 extends Sequence1 {

  private long mN = 0;
  private Z mProd = Z.valueOf(12);

  @Override
  public Z next() {
    if (++mN < 4) {
      return Functions.FACTORIAL.z(mN);
    }
    final Z t = mProd.divide(mN);
    mProd = mProd.multiply(t);
    return t;
  }
}
