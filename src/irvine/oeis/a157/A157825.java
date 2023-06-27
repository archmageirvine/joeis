package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157825 1728000n - 1620240.
 * @author Sean A. Irvine
 */
public class A157825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157825() {
    super(1, new long[] {-1, 2}, new long[] {107760, 1835760});
  }
}
