package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215687 Number of solid standard Young tableaux of shape <code>[[2*n,2],[2]]</code>.
 * @author Sean A. Irvine
 */
public class A215687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215687() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 16, 174, 690, 1876});
  }
}
