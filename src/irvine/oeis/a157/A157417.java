package irvine.oeis.a157;
// Generated by gen_seq4.pl 2024-12-13.ack/filprof at 2024-12-13 23:43

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A157417 Primes of the form floor((4*n^2-8*n-9)/3).
 * @author Georg Fischer
 */
public class A157417 extends FilterSequence {

  /** Construct the sequence. */
  public A157417() {
    super(1, new LambdaSequence(1, k -> Z.valueOf(k).square().multiply(4).subtract(8L * k + 9).divide(3)), PRIME);
  }
}
