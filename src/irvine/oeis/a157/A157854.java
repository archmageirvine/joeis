package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157854 1728000n - 384240.
 * @author Sean A. Irvine
 */
public class A157854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157854() {
    super(new long[] {-1, 2}, new long[] {1343760, 3071760});
  }
}
