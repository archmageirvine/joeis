package irvine.oeis.a053;

import irvine.oeis.PositionSequence;

/**
 * A053241 Numbers n such that A053238(n) = 2.
 * @author Sean A. Irvine
 */
public class A053241 extends PositionSequence {

  /** Construct the sequence. */
  public A053241() {
    super(1, new A053238(), 2);
  }
}
