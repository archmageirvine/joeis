package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074602 a(n) = 2^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074602() {
    super(new long[] {-14, 9}, new long[] {2, 9});
  }
}
