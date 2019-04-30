package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069564 <code>a(1) = 2; a(n) = k*a(n-1) + 1</code> is a multiple of n-th prime with <code>k &gt; 1</code>.
 * @author Georg Fischer
 */
public class A069564 extends FiniteSequence {

  /** Construct the sequence. */
  public A069564() {
    super(2, 9, 55, 441, 4411, 13234, 26469, 238222, 476445, 3335116, 60032089, 1680898493L, 15128086438L, 605123457521L, 6051234575211L, 90768518628166L);
  }
}
