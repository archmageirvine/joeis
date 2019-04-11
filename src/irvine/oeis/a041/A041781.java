package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041781 Denominators of continued fraction convergents to <code>sqrt(411)</code>.
 * @author Sean A. Irvine
 */
public class A041781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041781() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99460, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 11, 216, 227, 443, 670, 2453, 98790, 298823, 397613, 696436, 1094049, 21483367, 22577416, 44060783, 66638199, 243975380});
  }
}
