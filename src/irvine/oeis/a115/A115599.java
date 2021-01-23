package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115599 Consider all Pythagorean triples (X,X+1,Z) ordered by increasing Z; sequence gives Z-X values.
 * @author Sean A. Irvine
 */
public class A115599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115599() {
    super(new long[] {1, -7, 7}, new long[] {2, 9, 50});
  }
}
