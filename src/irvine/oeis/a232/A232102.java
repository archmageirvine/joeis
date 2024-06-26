package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a067.A067838;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A232102 Primes p with same last two digits as k, where prime(k) = p.
 * @author Georg Fischer
 */
public class A232102 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A232102() {
    super(1, new A067838(), v -> Functions.PRIME.z(v));
  }
}
