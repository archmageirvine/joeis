package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157092 Consider all consecutive integer Pythagorean <code>9-tuples (X, X+1, X+2, X+3, X+4, Z-3, Z-2, Z-1, Z)</code> ordered by increasing Z; sequence gives X values.
 * @author Sean A. Irvine
 */
public class A157092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157092() {
    super(new long[] {1, -19, 19}, new long[] {0, 36, 680});
  }
}
