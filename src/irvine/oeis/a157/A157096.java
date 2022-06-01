package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157096 Consider all consecutive integer Pythagorean 11-tuples (X, X+1, X+2, X+3, X+4, X+5, Z-4, Z-3, Z-2, Z-1, Z) ordered by increasing Z; sequence gives X values.
 * @author Sean A. Irvine
 */
public class A157096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157096() {
    super(new long[] {1, -23, 23}, new long[] {0, 55, 1260});
  }
}
