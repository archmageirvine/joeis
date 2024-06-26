package irvine.oeis.a126;
// Generated by gen_seq4.pl 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.oeis.a098.A098974;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A126720 Primes p such that p - q = 24, where q is the previous prime before p; or prime numbers preceded by precisely 23 composite numbers.
 * @author Georg Fischer
 */
public class A126720 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A126720() {
    super(1, new A098974(), v -> v.add(24));
  }
}
