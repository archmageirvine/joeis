package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054778.
 * @author Sean A. Irvine
 */
public class A054778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054778() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 120, 30240, 360360, 1860480, 6375600});
  }
}
