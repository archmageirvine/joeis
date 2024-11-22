package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;

/**
 * A073284.
 * @author Sean A. Irvine
 */
public class A073319 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073319() {
    super(1, 1, new A073318(), k -> k.signum() > 0);
  }
}

