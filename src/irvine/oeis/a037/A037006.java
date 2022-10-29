package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000796;

/**
 * A037006 Positions of the digit '8' in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A037006 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037006() {
    super(0, new A000796(), 8);
  }
}

