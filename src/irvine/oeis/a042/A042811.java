package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042811 Denominators of continued fraction convergents to <code>sqrt(936)</code>.
 * @author Sean A. Irvine
 */
public class A042811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042811() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 10402, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 32, 69, 101, 170, 10301, 10471, 20772, 52015, 332862, 717739, 1050601, 1768340});
  }
}
