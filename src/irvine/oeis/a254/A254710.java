package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254710.
 * @author Sean A. Irvine
 */
public class A254710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254710() {
    super(new long[] {1, -1, -14, 14, 1}, new long[] {1, 2, 9, 22, 119});
  }
}
