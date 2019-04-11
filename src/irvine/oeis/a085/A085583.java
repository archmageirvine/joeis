package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085583 Number of <code>(3412</code>,1234)-avoiding involutions in S_n.
 * @author Sean A. Irvine
 */
public class A085583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085583() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 2, 4, 8, 16, 29, 51});
  }
}
