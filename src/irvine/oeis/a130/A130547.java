package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-01-04/lambdan at 2024-01-05 23:45

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A130547 Numerators of 6*((Sum_{k=1..n} 1/binomial(2*k,k)) - 1/3), n &gt;= 1.
 * @author Georg Fischer
 */
public class A130547 extends LambdaSequence {

  /** Construct the sequence. */
  public A130547() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Binomial.binomial(2L * k, k))).subtract(new Q(1, 3)).multiply(Z.SIX).num());
  }
}
