package irvine.oeis.a033;

import irvine.oeis.RecordSequence;

/**
 * A033153 Incrementally largest terms in the continued fraction for Niven's constant.
 * @author Sean A. Irvine
 */
public class A033153 extends RecordSequence {

  /** Construct the sequence. */
  public A033153() {
    super(new A033151());
  }
}
