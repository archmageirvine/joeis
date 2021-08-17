package irvine.oeis.a050;

import irvine.oeis.PositionSequence;

/**
 * A050680 Positions of 3's in A050677.
 * @author Sean A. Irvine
 */
public class A050680 extends PositionSequence {

  /** Construct the sequence. */
  public A050680() {
    super(1, new A050677(), 3);
  }
}
