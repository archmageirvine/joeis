package irvine.oeis.a226;
// manually 2020-11-16

import irvine.oeis.RecordSequence;

/**
 * A226900 Record values of Hooley's Delta function A226898.
 * @author Georg Fischer
 */
public class A226900 extends RecordSequence {

  /** Construct the sequence. */
  public A226900() {
    super(new A226898(), false);
  }
}
