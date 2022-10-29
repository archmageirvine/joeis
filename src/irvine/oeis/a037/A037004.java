package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037004 Positions of the digit '5' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037004 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037004() {
    super(0, new A000796(), 5);
  }
}

