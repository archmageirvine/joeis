package irvine.oeis.a050;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048288;

/**
 * A050680 Positions of 3's in A048288.
 * @author Sean A. Irvine
 */
public class A050680 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A050680() {
    super(1, new A048288(), 3);
  }
}
