package irvine.oeis.a179;
// Generated by gen_seq4.pl 2023-10-19/simtraf at 2023-10-19 23:32

import irvine.oeis.a054.A054753;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A179694 Numbers of the form p^6*q^3 where p and q are distinct primes.
 * @author Georg Fischer
 */
public class A179694 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A179694() {
    super(1, new A054753(), v -> v.pow(3));
  }
}
