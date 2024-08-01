package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037007 Positions of the digit '9' in the decimal expansion of Pi, where positions 0, 1, 2,... correspond to digits 3, 1, 4, ....
 * @author Sean A. Irvine
 */
public class A037007 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037007() {
    super(0, new A000796(), 9);
  }
}

