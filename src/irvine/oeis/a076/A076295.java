package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076295 Consider all Pythagorean triples (Y-7,Y,Z); sequence gives Y values.
 * @author Sean A. Irvine
 */
public class A076295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076295() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {4, 7, 12, 15, 28, 55, 72});
  }
}
