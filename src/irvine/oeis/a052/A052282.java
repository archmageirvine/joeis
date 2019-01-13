package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052282.
 * @author Sean A. Irvine
 */
public class A052282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052282() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {1, 1, 3, 5, 9, 13, 22, 30, 45});
  }
}
