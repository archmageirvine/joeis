package irvine.oeis.a074;
// Generated by gen_seq4.pl 2024-12-13.ack/filprof at 2024-12-13 23:43

import irvine.math.cr.CR;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A074220 Primes of the form ceiling(n^Pi).
 * @author Georg Fischer
 */
public class A074220 extends FilterSequence {

  /** Construct the sequence. */
  public A074220() {
    super(1, new LambdaSequence(1, k -> CR.valueOf(k).pow(CR.PI).ceil()), PRIME);
  }
}
