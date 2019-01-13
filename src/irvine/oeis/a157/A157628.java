package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157628.
 * @author Sean A. Irvine
 */
public class A157628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157628() {
    super(new long[] {1, -3, 3}, new long[] {4801, 124001, 403201});
  }
}
