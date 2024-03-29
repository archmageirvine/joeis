package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037001 Positions of the digit '2' in the decimal expansion of Pi (where positions 0, 1, 2,... refer to the digits 3, 1, 4,...).
 * @author Sean A. Irvine
 */
public class A037001 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037001() {
    super(0, new A000796(), 2);
  }
}

