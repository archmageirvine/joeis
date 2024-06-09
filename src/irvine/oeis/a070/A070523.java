package irvine.oeis.a070;

import irvine.oeis.FilterPositionSequence;

/**
 * A070520.
 * @author Sean A. Irvine
 */
public class A070523 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070523() {
    super(1, new A070522(), PRIME);
  }
}
