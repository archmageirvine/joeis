package irvine.oeis.a366;
// Generated by gen_seq4.pl serexp/lambdan at 2024-01-22 15:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366359 G.f. satisfies A(x) = 1/(1 - x) + x/A(x)^4.
 * @author Georg Fischer
 */
public class A366359 extends LambdaSequence {

  /** Construct the sequence. */
  public A366359() {
    super(0, n -> Z.NEG_ONE.pow(n - 1).multiply(Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(5L * k - 1, k).multiply(Binomial.binomial(5L * k - 1, n - k)).divide(5L * k - 1))));
  }
}
