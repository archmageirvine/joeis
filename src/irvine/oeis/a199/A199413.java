package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199413 9*6^n+1.
 * @author Sean A. Irvine
 */
public class A199413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199413() {
    super(new long[] {-6, 7}, new long[] {10, 55});
  }
}
