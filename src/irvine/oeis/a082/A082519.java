package irvine.oeis.a082;
// Generated by gen_seq4.pl 2025-04-22.ack/lambdan at 2025-04-22 22:21

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A082519 Number of times that k^2 + (n-k)^2 is prime for 1 &lt;= k &lt;= n-1.
 * @author Georg Fischer
 */
public class A082519 extends LambdaSequence {

  /** Construct the sequence. */
  public A082519() {
    super(2, n -> Integers.SINGLETON.count(1, n - 1, k -> Predicates.PRIME.is(Z.valueOf(k).multiply(k).add(Z.valueOf(n - k).multiply(n - k)))));
  }
}
