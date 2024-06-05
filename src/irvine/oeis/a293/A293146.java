package irvine.oeis.a293;
// manually hygeom at 2022-08-06 15:16

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A293146 a(n) = n! * [x^n] exp(x/(1 - n*x)).
 * a(n) = n! * Sum_{k=1..n} n^(n-k) * binomial(n-1,k-1)/k! for n &gt; 0.
 * @author Georg Fischer
 */
public class A293146 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mN, k -> Z.valueOf(mN).pow(mN - k)
        .multiply(Functions.FACTORIAL.z(mN))
        .divide(Functions.FACTORIAL.z(k))
        .multiply(Binomial.binomial(mN - 1, k - 1))
    );
  }
}
