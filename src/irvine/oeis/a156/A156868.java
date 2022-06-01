package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156868 a(n) = 729000*n + 180.
 * @author Sean A. Irvine
 */
public class A156868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156868() {
    super(new long[] {-1, 2}, new long[] {729180, 1458180});
  }
}
