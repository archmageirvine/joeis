package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157084 Consider all consecutive integer Pythagorean quintuples <code>(X, X+1, X+2, Z-1, Z)</code> ordered by increasing Z; sequence gives X values.
 * @author Sean A. Irvine
 */
public class A157084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157084() {
    super(new long[] {1, -11, 11}, new long[] {0, 10, 108});
  }
}
