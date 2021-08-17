package irvine.oeis.a050;

import irvine.oeis.PositionSequence;

/**
 * A050682 Positions of 5's in A050677.
 * @author Sean A. Irvine
 */
public class A050682 extends PositionSequence {

  /** Construct the sequence. */
  public A050682() {
    super(1, new A050677(), 5);
  }
}
