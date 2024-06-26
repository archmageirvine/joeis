package irvine.oeis.a069;
// Generated by gen_seq4.pl 2024-04-17/simtraf at 2024-04-17 19:29

import irvine.oeis.a059.A059958;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A069354 Lowest base with simple divisibility test for n primes; smallest B such that omega(B) + omega(B-1) = n.
 * @author Georg Fischer
 */
public class A069354 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A069354() {
    super(1, new A059958(), v -> v.add(1));
  }
}
