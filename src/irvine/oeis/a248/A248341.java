package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248341 10^n - 7^n.
 * @author Sean A. Irvine
 */
public class A248341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248341() {
    super(new long[] {-70, 17}, new long[] {0, 3});
  }
}
