package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128798 <code>n*(n-1)*4^n</code>.
 * @author Sean A. Irvine
 */
public class A128798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128798() {
    super(new long[] {64, -48, 12}, new long[] {0, 0, 32});
  }
}
