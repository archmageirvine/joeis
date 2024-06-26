package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a060.A060646;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076367 Primes with subscripts from the Bonse sequence.
 * @author Georg Fischer
 */
public class A076367 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076367() {
    super(1, new A060646(), v -> Functions.PRIME.z(v));
  }
}
