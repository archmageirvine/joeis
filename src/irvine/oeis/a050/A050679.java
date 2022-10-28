package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048288;

/**
 * A050679 Positions of 2's in A048288.
 * @author Sean A. Irvine
 */
public class A050679 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050679() {
    super(1, new A048288(), 2);
  }
}
