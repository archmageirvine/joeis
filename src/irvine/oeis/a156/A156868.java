package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156868.
 * @author Sean A. Irvine
 */
public class A156868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156868() {
    super(new long[] {-1, 2}, new long[] {729180, 1458180});
  }
}
