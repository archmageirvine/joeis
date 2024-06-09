package irvine.oeis.a070;

import irvine.oeis.FilterPositionSequence;

/**
 * A070520.
 * @author Sean A. Irvine
 */
public class A070525 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070525() {
    super(1, new A070524(), PRIME);
  }
}
