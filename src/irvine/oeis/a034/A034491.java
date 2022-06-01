package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034491 7^n + 1.
 * @author Sean A. Irvine
 */
public class A034491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034491() {
    super(new long[] {-7, 8}, new long[] {2, 8});
  }
}
