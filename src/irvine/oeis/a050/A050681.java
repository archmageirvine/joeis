package irvine.oeis.a050;

import irvine.oeis.PositionSequence;
import irvine.oeis.a048.A048288;

/**
 * A050681 Positions of 4's in A050677.
 * @author Sean A. Irvine
 */
public class A050681 extends PositionSequence {

  /** Construct the sequence. */
  public A050681() {
    super(1, new A048288(), 4);
  }
}
