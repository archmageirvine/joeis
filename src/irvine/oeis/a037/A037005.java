package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037005 Positions of the digit '6' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037005 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037005() {
    super(0, new A000796(), 6);
  }
}

