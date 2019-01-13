package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245033.
 * @author Sean A. Irvine
 */
public class A245033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245033() {
    super(new long[] {-1, 4, -6, 4}, new long[] {49, 320, 729, 1300});
  }
}
