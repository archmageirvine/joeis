package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061278.
 * @author Sean A. Irvine
 */
public class A061278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061278() {
    super(new long[] {1, -5, 5}, new long[] {0, 1, 5});
  }
}
