package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157089 Consider all Consecutive Integer Pythagorean septuples (X, X+1, X+2, X+3, Z-2, Z-1, Z) ordered by increasing Z; sequence gives Z values.
 * @author Sean A. Irvine
 */
public class A157089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157089() {
    super(new long[] {1, -15, 15}, new long[] {3, 27, 363});
  }
}
