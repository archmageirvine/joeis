package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245969 The average Wiener index of the set of all fibonacenes with n hexagons.
 * @author Sean A. Irvine
 */
public class A245969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245969() {
    super(new long[] {-1, 4, -6, 4}, new long[] {271, 537, 931, 1477});
  }
}
