package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-12-08.ack/filprof at 2024-12-08 22:31

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A245528 Primes of the form n! - (n + 1)! + (n + 2)! - 1.
 * @author Georg Fischer
 */
public class A245528 extends FilterSequence {

  /** Construct the sequence. */
  public A245528() {
    super(1, new LambdaSequence(1, n -> Functions.FACTORIAL.z(n).subtract(Functions.FACTORIAL.z(n + 1)).add(Functions.FACTORIAL.z(n + 2)).subtract(1)), PRIME);
  }
}
