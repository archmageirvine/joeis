package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074601 a(n) = 2^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074601() {
    super(new long[] {-12, 8}, new long[] {2, 8});
  }
}
