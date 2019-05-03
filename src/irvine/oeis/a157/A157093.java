package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157093 Consider all Consecutive Integer Pythagorean <code>9-tuples (X,X+1,X+2,X+3,X+4,Z-3,Z-2,Z-1,Z)</code> ordered by increasing Z; sequence gives Z values.
 * @author Sean A. Irvine
 */
public class A157093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157093() {
    super(new long[] {1, -19, 19}, new long[] {4, 44, 764});
  }
}
