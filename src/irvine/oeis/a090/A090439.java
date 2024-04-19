package irvine.oeis.a090;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A090439 Alternating row sums of array A090438 ((4,2)-Stirling2).
 * @author Georg Fischer
 */
public class A090439 extends LambdaSequence {

  /** Construct the sequence. */
  public A090439() {
    // seq(add((-1)^k*(2*n)!/k!*binomial(2*(n-1), k-2), k=2..2*n),n=1..10);
    super(1, n -> Rationals.SINGLETON.sum(2, 2 * n, k -> {
      return new Q(Z.NEG_ONE.pow(k).multiply(Functions.FACTORIAL.z(2 * n)), Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(2 * (n - 1), k - 2));
    }).num());
  }

}
