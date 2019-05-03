package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171857 Number of <code>n-step up-side self-avoiding</code> walks on the lattice strip <code>{0,1,2} x Z (up-side</code> means that the walks move up and sideways but not down).
 * @author Sean A. Irvine
 */
public class A171857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171857() {
    super(new long[] {1, 1, -1, 2}, new long[] {1, 2, 4, 8});
  }
}
