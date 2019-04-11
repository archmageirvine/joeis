package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015593 <code>a(n) = 11*a(n-1) + 2*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015593() {
    super(new long[] {2, 11}, new long[] {0, 1});
  }
}
