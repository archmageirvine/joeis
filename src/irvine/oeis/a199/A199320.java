package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199320 5*6^n+1.
 * @author Sean A. Irvine
 */
public class A199320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199320() {
    super(new long[] {-6, 7}, new long[] {6, 31});
  }
}
