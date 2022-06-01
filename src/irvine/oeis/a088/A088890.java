package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088890 Polynexus numbers of order 8.
 * @author Sean A. Irvine
 */
public class A088890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088890() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 25, 234, 1290, 5115, 16211, 43700});
  }
}
