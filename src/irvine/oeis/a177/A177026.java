package irvine.oeis.a177;
// Generated by gen_seq4.pl 2025-04-28.ack/filprof at 2025-04-28 23:36

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A177026 Primes of the form 4^k*(2^k-1)+1.
 * @author Georg Fischer
 */
public class A177026 extends FilterSequence {

  /** Construct the sequence. */
  public A177026() {
    super(1, new LambdaSequence(0, k -> Z.FOUR.pow(k).multiply(Z.TWO.pow(k).subtract(1)).add(1)), PRIME);
  }
}
