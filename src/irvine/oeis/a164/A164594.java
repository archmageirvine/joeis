package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164594.
 * @author Sean A. Irvine
 */
public class A164594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164594() {
    super(new long[] {-8, 8}, new long[] {5, 32});
  }
}
