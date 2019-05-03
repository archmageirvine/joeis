package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129548 Measures of entanglement in <code>3-qbits</code>.
 * @author Sean A. Irvine
 */
public class A129548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129548() {
    super(new long[] {1, -2, -4, 10, 5, -20, 0, 20, -5, -10, 4, 2}, new long[] {1, 1, 8, 9, 36, 43, 120, 147, 329, 406, 784, 966});
  }
}
