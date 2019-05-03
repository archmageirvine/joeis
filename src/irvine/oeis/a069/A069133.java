package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069133 Centered <code>20-gonal (or icosagonal)</code> numbers.
 * @author Sean A. Irvine
 */
public class A069133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069133() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 61});
  }
}
