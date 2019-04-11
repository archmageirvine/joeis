package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157444 <code>a(n) = 1331*n - 209</code>.
 * @author Sean A. Irvine
 */
public class A157444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157444() {
    super(new long[] {-1, 2}, new long[] {1122, 2453});
  }
}
