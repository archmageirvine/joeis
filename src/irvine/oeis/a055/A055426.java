package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055426 Number of points in <code>Z^n</code> of norm <code>&lt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A055426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055426() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 5, 13, 33, 89});
  }
}
