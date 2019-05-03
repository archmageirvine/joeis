package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089117 Convoluted convolved Fibonacci numbers <code>G_j^(4)</code>.
 * @author Sean A. Irvine
 */
public class A089117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089117() {
    super(new long[] {-1, -4, -4, 0, 2, 12, 12, -12, -7, -4, -12, 20, 10, -16, 0, 4}, new long[] {0, 1, 3, 10, 25, 64, 146, 331, 710, 1505, 3091, 6272, 12473, 24540, 47610, 91527});
  }
}
