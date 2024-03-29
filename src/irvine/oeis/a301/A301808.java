package irvine.oeis.a301;
// Generated by gen_seq4.pl 2024-01-23/filter at 2024-01-25 00:21

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A301808 Primes of form 4*k^k + 3.
 * @author Georg Fischer
 */
public class A301808 extends FilterSequence {

  /** Construct the sequence. */
  public A301808() {
    super(1, new LambdaSequence(1, k -> Z.FOUR.multiply(Z.valueOf(k).pow(k)).add(3)), PRIME);
  }
}
