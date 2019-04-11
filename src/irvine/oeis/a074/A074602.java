package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074602 <code>a(n) = 2^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074602() {
    super(new long[] {-14, 9}, new long[] {2, 9});
  }
}
