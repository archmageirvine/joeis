package irvine.oeis.a072;

import irvine.oeis.RecordSequence;

/**
 * A072715 Record differences between n-th prime and 2n-th prime.
 * @author Sean A. Irvine
 */
public class A072715 extends RecordSequence {

  /** Construct the sequence. */
  public A072715() {
    super(1, new A072473());
  }
}
