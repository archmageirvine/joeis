package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274311.
 * @author Sean A. Irvine
 */
public class A274311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274311() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 9, 75, 331, 1055, 2745});
  }
}
