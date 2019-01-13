package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248833.
 * @author Sean A. Irvine
 */
public class A248833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248833() {
    super(new long[] {1, -9, 9}, new long[] {10, 25, 160});
  }
}
