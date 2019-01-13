package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157961.
 * @author Sean A. Irvine
 */
public class A157961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157961() {
    super(new long[] {-1, 2}, new long[] {241, 483});
  }
}
