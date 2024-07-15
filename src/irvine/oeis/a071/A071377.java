package irvine.oeis.a071;

import irvine.oeis.PartialSumSequence;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071377 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071377() {
    super(1, new A071374().skip());
  }
}
