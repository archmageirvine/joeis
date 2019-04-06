package irvine.oeis.a202;

import irvine.oeis.FiniteSequence;

/**
 * A202271 Right-truncatable perfect powers: every prefix is perfect power.
 * @author Georg Fischer
 */
public class A202271 extends FiniteSequence {

  /** Construct the sequence. */
  public A202271() {
    super(1, 4, 8, 9, 16, 49, 81, 169);
  }
}
