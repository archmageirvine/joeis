package irvine.oeis.a182;
// Generated by gen_seq4.pl 2025-04-28.ack/filprof at 2025-04-28 23:36

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A182328 Primes of the form 4^n + n^2.
 * @author Georg Fischer
 */
public class A182328 extends FilterSequence {

  /** Construct the sequence. */
  public A182328() {
    super(1, new LambdaSequence(0, k -> Z.FOUR.pow(k).add(Z.valueOf(k).multiply(k))), PRIME);
  }
}
