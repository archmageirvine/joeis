package irvine.oeis.a103;
// manually 2026-10-27/rambdan at 2026-10-27 

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.RationalLambdaSequence;

/**
 * A103990 Reduced numerators of the hypercube line-picking integrand sqrt(Pi)*I(n,0).
 * @author Georg Fischer
 */
public class A103990 extends RationalLambdaSequence implements Conjectural {

  /** Construct the sequence. */
  public A103990() {
    super(1, NUM, n -> new Q(2, 3).multiply(Z.valueOf(n - 1).multiply(n).add(2).multiply(n).add(1)).divide(2 * n + 1));
  }
}
