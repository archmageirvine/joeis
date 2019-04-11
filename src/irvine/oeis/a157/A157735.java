package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157735 <code>18522n - 8274</code>.
 * @author Sean A. Irvine
 */
public class A157735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157735() {
    super(new long[] {-1, 2}, new long[] {10248, 28770});
  }
}
