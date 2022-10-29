package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037003 Positions of the digit '4' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037003 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037003() {
    super(0, new A000796(), 4);
  }
}

