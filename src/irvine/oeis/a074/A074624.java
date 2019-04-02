package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074624 a(n) = 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074624() {
    super(new long[] {-72, 17}, new long[] {2, 17});
  }
}
