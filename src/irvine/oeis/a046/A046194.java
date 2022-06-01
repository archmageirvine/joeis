package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046194 Heptagonal triangular numbers.
 * @author Sean A. Irvine
 */
public class A046194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046194() {
    super(new long[] {1, -1, -103682, 103682, 1}, new long[] {1, 55, 121771, 5720653, 12625478965L});
  }
}
