package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239325.
 * @author Sean A. Irvine
 */
public class A239325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239325() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 41});
  }
}
