package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220468 Number of cyclotomic cosets of n mod 10.
 * @author Sean A. Irvine
 */
public class A220468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220468() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 10, 2, 4, 3, 2, 5, 4, 2, 6});
  }
}
