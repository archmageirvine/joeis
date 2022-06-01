package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199687 7*10^n+1.
 * @author Sean A. Irvine
 */
public class A199687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199687() {
    super(new long[] {-10, 11}, new long[] {8, 71});
  }
}
