package irvine.oeis.a302;
// Generated by gen_seq4.pl 2024-01-23/filter at 2024-01-25 00:21

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A302089 Primes of form 5*k^k + 4.
 * @author Georg Fischer
 */
public class A302089 extends FilterSequence {

  /** Construct the sequence. */
  public A302089() {
    super(1, new LambdaSequence(0, k -> Z.FIVE.multiply(Z.valueOf(k).pow(k)).add(4)), PRIME);
  }
}
