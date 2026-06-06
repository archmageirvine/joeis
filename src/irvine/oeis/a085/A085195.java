package irvine.oeis.a085;

import irvine.oeis.PartialSumSequence;

/**
 * A085195 Partial sums of A085194.
 * @author Sean A. Irvine
 */
public class A085195 extends PartialSumSequence {

  /** Construct the sequence. */
  public A085195() {
    super(0, new A085194().prepend(0));
  }
}
