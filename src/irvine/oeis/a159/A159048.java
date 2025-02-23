package irvine.oeis.a159;
// Generated by gen_seq4.pl 2024-12-15.ack/filprof at 2024-12-15 23:09

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A159048 Primes of the form m*(m+1)/2 + 4.
 * @author Georg Fischer
 */
public class A159048 extends FilterSequence {

  /** Construct the sequence. */
  public A159048() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).multiply(k + 1).divide(2).add(4)), PRIME);
  }
}
