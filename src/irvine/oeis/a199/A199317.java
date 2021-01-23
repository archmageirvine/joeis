package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199317 2*6^n+1.
 * @author Sean A. Irvine
 */
public class A199317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199317() {
    super(new long[] {-6, 7}, new long[] {3, 13});
  }
}
