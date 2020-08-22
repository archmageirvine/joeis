package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122770 Numbers k such that A056109(k) is a square.
 * @author Sean A. Irvine
 */
public class A122770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122770() {
    super(new long[] {1, -15, 15}, new long[] {0, 6, 88});
  }
}
