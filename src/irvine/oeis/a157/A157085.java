package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157085 Consider all Consecutive Integer Pythagorean quintuples (X, X+1, X+2, Z-1, Z) ordered by increasing Z; sequence gives Z values.
 * @author Sean A. Irvine
 */
public class A157085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157085() {
    super(new long[] {1, -11, 11}, new long[] {2, 14, 134});
  }
}
