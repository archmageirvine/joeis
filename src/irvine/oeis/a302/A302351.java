package irvine.oeis.a302;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A302351 Hyper-Wiener index of body-centered cubic grid cells in a row.
 * @author Georg Fischer
 */
public class A302351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302351() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {92, 377, 1128, 2700, 5548});
  }
}
