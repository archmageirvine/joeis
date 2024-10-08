package irvine.oeis.a200;
// Generated by gen_seq4.pl 2024-09-11.ack/filter at 2024-09-11 23:28

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A200832 Primes of the form (2^k + k)*2^k + 1.
 * @author Georg Fischer
 */
public class A200832 extends FilterSequence {

  /** Construct the sequence. */
  public A200832() {
    super(1, new LambdaSequence(1, k -> Z.TWO.pow(k).add(k).multiply(Z.TWO.pow(k)).add(1)), v -> v.isProbablePrime());
  }
}
