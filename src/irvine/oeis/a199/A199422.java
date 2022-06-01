package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199422 5*7^n+1.
 * @author Sean A. Irvine
 */
public class A199422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199422() {
    super(new long[] {-7, 8}, new long[] {6, 36});
  }
}
