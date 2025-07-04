package irvine.oeis.a162;
// Generated by gen_seq4.pl 2025-04-30.ack/filprof at 2025-04-30 23:37

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A162603 Primes of the form k^k - k! + 1.
 * @author Georg Fischer
 */
public class A162603 extends FilterSequence {

  /** Construct the sequence. */
  public A162603() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).pow(k).subtract(Functions.FACTORIAL.z(k)).add(1)), PRIME);
  }
}
