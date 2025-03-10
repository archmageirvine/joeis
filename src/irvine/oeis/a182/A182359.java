package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-12-15.ack/filprof at 2024-12-15 23:09

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A182359 Primes of the form 5^n + n^4.
 * @author Georg Fischer
 */
public class A182359 extends FilterSequence {

  /** Construct the sequence. */
  public A182359() {
    super(1, new LambdaSequence(0, k -> Z.FIVE.pow(k).add(Z.valueOf(k).pow(4))), PRIME);
  }
}
