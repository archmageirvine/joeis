package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074623 a(n) = 7^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074623() {
    super(new long[] {-63, 16}, new long[] {2, 16});
  }
}
