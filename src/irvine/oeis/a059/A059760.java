package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059760 a(n) is the number of edges (one-dimensional faces) in the convex polytope of real n X n doubly stochastic matrices.
 * a(n) = 1/2* n! * Sum_{k=2...n} C(n,k)*(k-1)!.
 * @author Georg Fischer
 */
public class A059760 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(2, mN, k -> {
      return Binomial.binomial(mN, k).multiply(Functions.FACTORIAL.z(k - 1));
    }).multiply(Functions.FACTORIAL.z(mN)).divide2();
  }
}
