package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133894.
 * @author Sean A. Irvine
 */
public class A133894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133894() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {12, 13, 14, 15, 28});
  }
}
