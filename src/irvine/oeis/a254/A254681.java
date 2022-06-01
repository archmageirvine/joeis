package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254681 Fifth partial sums of fourth powers (A000583).
 * @author Sean A. Irvine
 */
public class A254681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254681() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 21, 176, 936, 3750, 12342, 35112, 89232, 207207, 446875});
  }
}
