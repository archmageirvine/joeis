package irvine.oeis.a267;
// Generated by gen_seq4.pl 2024-12-15.ack/filprof at 2024-12-15 23:09

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A267252 Primes of the form abs(103*n^2 - 4707*n + 50383) in order of increasing nonnegative n.
 * @author Georg Fischer
 */
public class A267252 extends FilterSequence {

  /** Construct the sequence. */
  public A267252() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(103L * k - 4707).multiply(k).add(50383).abs()), PRIME);
  }
}
