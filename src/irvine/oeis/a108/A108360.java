package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108360 Expansion of (1-2x)^2/((1-x)^2(1-2x-x^2)^2).
 * @author Sean A. Irvine
 */
public class A108360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108360() {
    super(new long[] {-1, -2, 5, 4, -11, 6}, new long[] {1, 2, 5, 12, 30, 76});
  }
}
