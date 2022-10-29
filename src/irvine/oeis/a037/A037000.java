package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037000 Positions of the digit '1' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037000 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037000() {
    super(0, new A000796(), 1);
  }
}

