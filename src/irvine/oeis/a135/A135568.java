package irvine.oeis.a135;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A135568 a(n) = floor( Product_{i=1..n} prime(i)/i ).
 * a(n)=floor(prod(i=1, n, prime(i)/i))
 * @author Georg Fischer
 */
public class A135568 extends LambdaSequence {

  /** Construct the sequence. */
  public A135568() {
    super(0, n -> Rationals.SINGLETON.product(1, n, i -> new Q(Functions.PRIME.z(i), i)).floor());
  }
}
