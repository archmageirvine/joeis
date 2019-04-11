package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157825 <code>1728000n - 1620240</code>.
 * @author Sean A. Irvine
 */
public class A157825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157825() {
    super(new long[] {-1, 2}, new long[] {107760, 1835760});
  }
}
