package irvine.oeis.a050;

import irvine.oeis.PositionSequence;

/**
 * A050679 Positions of 2's in A050677.
 * @author Sean A. Irvine
 */
public class A050679 extends PositionSequence {

  /** Construct the sequence. */
  public A050679() {
    super(1, new A050677(), 2);
  }
}
