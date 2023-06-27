package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115598 Consider all Pythagorean triples (X,X+1,Z) ordered by increasing Z; sequence gives Z-(X+1) values.
 * @author Sean A. Irvine
 */
public class A115598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115598() {
    super(1, new long[] {1, -7, 7}, new long[] {1, 8, 49});
  }
}
