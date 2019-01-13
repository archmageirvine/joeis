package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056005.
 * @author Sean A. Irvine
 */
public class A056005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056005() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 2, 19, 90, 302, 820});
  }
}
