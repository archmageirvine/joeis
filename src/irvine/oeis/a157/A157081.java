package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157081 <code>32805000n^2 + 16200n + 1</code>.
 * @author Sean A. Irvine
 */
public class A157081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157081() {
    super(new long[] {1, -3, 3}, new long[] {32821201, 131252401, 295293601});
  }
}
