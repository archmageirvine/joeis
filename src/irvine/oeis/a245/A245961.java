package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245961 Number of 4-cycles in the Lucas cube <code>Lambda(n)</code>.
 * @author Sean A. Irvine
 */
public class A245961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245961() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 0, 0, 0, 2, 5});
  }
}
