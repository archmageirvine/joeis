package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-24.ack/filter at 2025-05-24 23:04

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A383685 The lesser of two consecutive primes whose gap equals the difference between their digital roots.
 * @author Georg Fischer
 */
public class A383685 extends FilterSequence {

  /** Construct the sequence. */
  public A383685() {
    super(1, new A000040(), p -> {
      final Z q = Functions.NEXT_PRIME.z(p);
      return q.subtract(p).equals(Math.abs(Functions.DIGIT_SUM_ROOT.i(p) - Functions.DIGIT_SUM_ROOT.i(q)));
    });
  }
}
