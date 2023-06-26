package irvine.oeis.a307;

import irvine.oeis.FiniteSequence;

/**
 * A307061 Even-time state complexity profile of Leech lattice constructed as a laminated Eisenstein lattice.
 * @author Georg Fischer
 */
public class A307061 extends FiniteSequence {

  /** Construct the sequence. */
  public A307061() {
    super(1, FINITE, 1, 12, 64, 192, 576, 972, 729, 972, 576, 192, 64, 12, 1);
  }
}
