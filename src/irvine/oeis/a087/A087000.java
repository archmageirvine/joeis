package irvine.oeis.a087;
// Generated by gen_seq4.pl 2024-07-01/sintrif at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002371;
import irvine.oeis.a028.A028416;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A087000 Half length of periodic part of decimal expansion of 1/p for those primes having a periodic part of even length.
 * @author Georg Fischer
 */
public class A087000 extends SingleTransformSequence {

  private static final DirectSequence A002371 = new A002371();

  /** Construct the sequence. */
  public A087000() {
    super(1, (term, n) -> A002371.a(Functions.PRIME_PI.z(term)).divide(2), "", new A028416());
  }
}
