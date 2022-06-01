package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036222 Expansion of 1/(1-3*x)^9; 9-fold convolution of A000244 (powers of 3).
 * @author Sean A. Irvine
 */
public class A036222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036222() {
    super(new long[] {19683, -59049, 78732, -61236, 30618, -10206, 2268, -324, 27}, new long[] {1, 27, 405, 4455, 40095, 312741, 2189187, 14073345, 84440070});
  }
}
