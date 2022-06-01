package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199311 8*5^n+1.
 * @author Sean A. Irvine
 */
public class A199311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199311() {
    super(new long[] {-5, 6}, new long[] {9, 41});
  }
}
