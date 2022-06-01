package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199321 7*6^n+1.
 * @author Sean A. Irvine
 */
public class A199321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199321() {
    super(new long[] {-6, 7}, new long[] {8, 43});
  }
}
