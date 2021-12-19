package irvine.oeis.a053;

import irvine.oeis.PositionSequence;

/**
 * A053244 Numbers n such that A053238(n) = 4.
 * @author Sean A. Irvine
 */
public class A053244 extends PositionSequence {

  /** Construct the sequence. */
  public A053244() {
    super(1, new A053238(), 4);
  }
}
