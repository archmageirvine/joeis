package irvine.oeis.a037;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000796;

/**
 * A037002 Positions of the digit '3' in the decimal expansion of Pi - 3.
 * @author Sean A. Irvine
 */
public class A037002 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A037002() {
    super(1, new SkipSequence(new A000796(), 1), 3);
  }
}

