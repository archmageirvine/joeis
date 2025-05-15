package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199492 a(n) = 11*7^n + 1.
 * @author Sean A. Irvine
 */
public class A199492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199492() {
    super(new long[] {-7, 8}, new long[] {12, 78});
  }
}
