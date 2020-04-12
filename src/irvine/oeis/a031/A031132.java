package irvine.oeis.a031;

import irvine.oeis.RecordSequence;

/**
 * A031132 Record differences between n-th prime and <code>(n+2)-nd</code> prime.
 * @author Sean A. Irvine
 */
public class A031132 extends RecordSequence {

  /** Construct the sequence. */
  public A031132() {
    super(new A031131());
  }
}

