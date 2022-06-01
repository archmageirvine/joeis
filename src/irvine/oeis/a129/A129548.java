package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129548 Measures of entanglement in 3-qbits.
 * @author Sean A. Irvine
 */
public class A129548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129548() {
    super(new long[] {1, -2, -4, 10, 5, -20, 0, 20, -5, -10, 4, 2}, new long[] {1, 1, 8, 9, 36, 43, 120, 147, 329, 406, 784, 966});
  }
}
