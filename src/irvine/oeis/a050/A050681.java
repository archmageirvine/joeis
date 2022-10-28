package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048288;

/**
 * A050681 Positions of 4's in A048288.
 * @author Sean A. Irvine
 */
public class A050681 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050681() {
    super(1, new A048288(), 4);
  }
}
