package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199415 11*6^n+1.
 * @author Sean A. Irvine
 */
public class A199415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199415() {
    super(new long[] {-6, 7}, new long[] {12, 67});
  }
}
