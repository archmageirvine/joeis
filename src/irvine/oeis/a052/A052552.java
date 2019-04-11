package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052552 <code>a(2*n+1) = 1, a(2*n) = 2*a(2*n-2)-1</code>.
 * @author Sean A. Irvine
 */
public class A052552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052552() {
    super(new long[] {-2, 2, 1}, new long[] {2, 1, 3});
  }
}
