package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199319 4*6^n+1.
 * @author Sean A. Irvine
 */
public class A199319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199319() {
    super(new long[] {-6, 7}, new long[] {5, 25});
  }
}
