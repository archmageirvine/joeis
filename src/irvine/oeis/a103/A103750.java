package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103750.
 * @author Sean A. Irvine
 */
public class A103750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103750() {
    super(new long[] {2, -1, 0, 1}, new long[] {1, 1, 1, 2});
  }
}
