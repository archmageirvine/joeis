package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015611 <code>a(n) = 12*a(n-1) + 7*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015611() {
    super(new long[] {7, 12}, new long[] {0, 1});
  }
}
