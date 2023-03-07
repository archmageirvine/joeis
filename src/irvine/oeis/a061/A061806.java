package irvine.oeis.a061;

import irvine.oeis.FilterPositionSequence;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061806 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A061806() {
    super(1, 0, new A061903(), k -> k.longValue() == 3);
  }
}

