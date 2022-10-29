package irvine.oeis.a036;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A036974 Positions of the digit '7' in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A036974 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A036974() {
    super(0, new A000796(), 7);
  }
}

