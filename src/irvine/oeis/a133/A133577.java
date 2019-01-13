package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133577.
 * @author Sean A. Irvine
 */
public class A133577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133577() {
    super(new long[] {10, 1}, new long[] {1, 2});
  }
}
