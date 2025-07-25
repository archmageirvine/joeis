package irvine.oeis.a243;
// Generated by gen_seq4.pl 2025-07-21.ack/filter at 2025-07-21 18:34

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A243616 Primes p of the form prime(n) + digitsum(n).
 * @author Georg Fischer
 */
public class A243616 extends FilterSequence {

  /** Construct the sequence. */
  public A243616() {
    super(1, new LambdaSequence(0, n -> Functions.DIGIT_SUM.z(n).add(Functions.PRIME.z(n))), PRIME);
  }
}
