package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198691 10*7^n-1.
 * @author Sean A. Irvine
 */
public class A198691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198691() {
    super(new long[] {-7, 8}, new long[] {9, 69});
  }
}
