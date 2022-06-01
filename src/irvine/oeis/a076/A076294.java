package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076294 Consider all Pythagorean triples (X,X+7,Z); sequence gives Z values.
 * @author Sean A. Irvine
 */
public class A076294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076294() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {5, 7, 13, 17, 35, 73});
  }
}
