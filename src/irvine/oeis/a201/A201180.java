package irvine.oeis.a201;
// Generated by gen_seq4.pl 2025-04-30.ack/filprof at 2025-04-30 23:37

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A201180 Primes of the form 6n^5+5.
 * @author Georg Fischer
 */
public class A201180 extends FilterSequence {

  /** Construct the sequence. */
  public A201180() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).pow(3).multiply(6).add(5)), PRIME);
  }
}
