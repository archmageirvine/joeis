package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076296 Consider all Pythagorean triples (X,X+7,Z); sequence gives X values.
 * @author Sean A. Irvine
 */
public class A076296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076296() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {-3, 0, 5, 8, 21, 48, 65});
  }
}
