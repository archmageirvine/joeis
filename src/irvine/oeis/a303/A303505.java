package irvine.oeis.a303;
// manually hygeom at 2022-08-06 16:50

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A303505 Number of odd chordless cycles in the n-triangular (Johnson) graph.
 * a(n) = Sum_{k=2, ceiling(n/2)-1} binomial(n, 2*k+1)*(2*k)!/2.
 * @author Georg Fischer
 */
public class A303505 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(2, new Q(mN, 2).ceiling().intValue() - 1, k -> {
      return Binomial.binomial(mN, 2L * k + 1).multiply(Functions.FACTORIAL.z(2 * k)).divide2();
    });
  }
}
