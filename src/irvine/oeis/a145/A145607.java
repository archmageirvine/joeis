package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145607 Numbers k such that (3*(2*k + 1)^2 + 2)/5 is a square.
 * @author Sean A. Irvine
 */
public class A145607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145607() {
    super(1, new long[] {1, -9, 9}, new long[] {0, 4, 35});
  }
}
