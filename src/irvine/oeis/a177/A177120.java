package irvine.oeis.a177;
// Generated by gen_seq4.pl 2025-04-28.ack/filprof at 2025-04-28 23:36

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A177120 Primes of the form (5*10^n+3).
 * @author Georg Fischer
 */
public class A177120 extends FilterSequence {

  /** Construct the sequence. */
  public A177120() {
    super(1, new LambdaSequence(0, k -> Z.TEN.pow(k).multiply(5).add(3)), PRIME);
  }
}
