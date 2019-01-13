package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061925.
 * @author Sean A. Irvine
 */
public class A061925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061925() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 3, 6});
  }
}
