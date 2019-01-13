package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133142.
 * @author Sean A. Irvine
 */
public class A133142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133142() {
    super(new long[] {1, -1443, 1443}, new long[] {1, 1201, 1731661});
  }
}
