package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115598 Consider all Pythagorean triples <code>(X,X+1,Z)</code> ordered by increasing Z; sequence gives <code>Z-(X+1)</code> values.
 * @author Sean A. Irvine
 */
public class A115598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115598() {
    super(new long[] {1, -7, 7}, new long[] {1, 8, 49});
  }
}
