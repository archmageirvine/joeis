package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065949 Bessel polynomial {y_n}'''(0).
 * @author Sean A. Irvine
 */
public class A065949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065949() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 90, 630, 2520, 7560});
  }
}
