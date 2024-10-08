package irvine.oeis.a074;
// Generated by gen_seq4.pl 2024-09-16.ack/lambdan at 2024-09-16 19:36

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A074799 a(n) = numerator( (4*n+1)*(Product_{i=1..n} (2*i-1)/Product_{i=1..n} 2*i)^5 ).
 * @author Georg Fischer
 */
public class A074799 extends LambdaSequence {

  /** Construct the sequence. */
  public A074799() {
    super(0, n -> new Q(Binomial.binomial(2L * n, n), Z.FOUR.pow(n)).pow(5).multiply(4L * n + 1).num());
  }
}
