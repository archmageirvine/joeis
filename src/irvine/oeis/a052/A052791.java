package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052791 3^(n-3)*n*(n-1)*(n-2).
 * @author Sean A. Irvine
 */
public class A052791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052791() {
    super(new long[] {-81, 108, -54, 12}, new long[] {0, 0, 0, 6});
  }
}
