package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074601 <code>a(n) = 2^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074601() {
    super(new long[] {-12, 8}, new long[] {2, 8});
  }
}
