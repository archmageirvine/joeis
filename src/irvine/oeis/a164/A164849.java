package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164849 Diagonal sum of (100^n,1) Pascal Triangle.
 * @author Sean A. Irvine
 */
public class A164849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164849() {
    super(new long[] {-100, -100, 101, 1}, new long[] {1, 1, 101, 102});
  }
}
