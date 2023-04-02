package irvine.oeis.a062;

import irvine.oeis.FilterPositionSequence;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062514 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A062514() {
    super(1, 1, new A062402(), PRIME);
  }
}
