package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037008 Positions of the digit '0' in the decimal expansion of Pi, where positions 0, 1, 2, ... correspond to digits 3, 1, 4, ....
 * @author Sean A. Irvine
 */
public class A037008 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037008() {
    super(0, new A000796(), 0);
  }
}

