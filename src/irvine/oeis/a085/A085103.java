package irvine.oeis.a085;

import irvine.oeis.FilterPositionSequence;

/**
 * A396532.
 * @author Sean A. Irvine
 */
public class A085103 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085103() {
    super(1, new A085102(), ZERO);
  }
}

