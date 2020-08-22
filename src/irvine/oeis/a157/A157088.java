package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157088 Consider all consecutive integer Pythagorean septuples (X, X+1, X+2, X+3, Z-2, Z-1, Z) ordered by increasing Z; sequence gives X values.
 * @author Sean A. Irvine
 */
public class A157088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157088() {
    super(new long[] {1, -15, 15}, new long[] {0, 21, 312});
  }
}
