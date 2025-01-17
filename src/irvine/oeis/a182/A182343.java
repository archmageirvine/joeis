package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-12-15.ack/filprof at 2024-12-15 23:09

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A182343 Primes of the form k^4 + 2 for k &gt;= 0.
 * @author Georg Fischer
 */
public class A182343 extends FilterSequence {

  /** Construct the sequence. */
  public A182343() {
    super(1, new LambdaSequence(k -> Z.valueOf(k).pow(4).add(2)), PRIME);
  }
}
