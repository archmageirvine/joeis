package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290364.
 * @author Sean A. Irvine
 */
public class A290364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290364() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 42, 817, 8429, 55627, 268272, 1030101, 3331117, 9425128});
  }
}
