package irvine.oeis.a144;
// Generated by gen_seq4.pl 2024-12-08.ack/filprof at 2024-12-08 22:31

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A144957 Primes of the form n!-n^2-1.
 * @author Georg Fischer
 */
public class A144957 extends FilterSequence {

  /** Construct the sequence. */
  public A144957() {
    super(1, new LambdaSequence(1, n -> Functions.FACTORIAL.z(n).subtract(Z.valueOf(n).square()).subtract(1)), PRIME);
  }
}
