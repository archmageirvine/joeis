package irvine.oeis.a088;
// Generated by gen_seq4.pl 2025-01-03.ack/filprof at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A088547 Primes of the form x^3+x^2+x+2.
 * @author Georg Fischer
 */
public class A088547 extends FilterSequence {

  /** Construct the sequence. */
  public A088547() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).multiply(Z.valueOf(k).multiply(Z.valueOf(k).add(1)).add(1)).add(2)), PRIME);
  }
}
