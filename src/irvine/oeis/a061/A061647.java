package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061647.
 * @author Sean A. Irvine
 */
public class A061647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061647() {
    super(new long[] {-1, 2, 2}, new long[] {1, 3, 9});
  }
}
