package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074616 a(n) = 5^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074616() {
    super(new long[] {-35, 12}, new long[] {2, 12});
  }
}
