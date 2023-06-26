package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069564 a(1) = 2; a(n) = k*a(n-1) + 1 is a multiple of n-th prime with k &gt; 1.
 * @author Georg Fischer
 */
public class A069564 extends FiniteSequence {

  /** Construct the sequence. */
  public A069564() {
    super(1, FINITE, 2, 9, 55, 441, 4411, 13234, 26469, 238222, 476445, 3335116, 60032089, 1680898493L, 15128086438L, 605123457521L, 6051234575211L, 90768518628166L);
  }
}
