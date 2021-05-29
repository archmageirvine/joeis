package irvine.oeis.a047;

import irvine.oeis.PositionSequence;

/**
 * A047986 Integers n such that A047988(n)=3.
 *
 * @author Sean A. Irvine
 */
public class A047986 extends PositionSequence {

  /**
   * Construct the sequence.
   */
  public A047986() {
    super(2, new A047988(), 3);
  }
}
