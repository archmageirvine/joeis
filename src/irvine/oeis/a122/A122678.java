package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122678 Invariant number of polygons of n-circum-C_5 H_5 systems.
 * @author Sean A. Irvine
 */
public class A122678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122678() {
    super(1, new long[] {1, -4, 4}, new long[] {1, 6, 21});
  }
}
