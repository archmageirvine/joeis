package irvine.oeis.a344;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A344435 a(n) = Sum_{k=1..n} (A000292(n) mod A000217(k)).
 * a(n) = sum(k=1,n,binom(n+2,3) % binom(k+1,2));
 * @author Georg Fischer
 */
public class A344435 extends LambdaSequence {

  /** Construct the sequence. */
  public A344435() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(n + 2, 3).mod(Binomial.binomial(k + 1, 2))));
  }
}
