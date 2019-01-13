package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008506.
 * @author Sean A. Irvine
 */
public class A008506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008506() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13},
      new long[] {1, 14, 105, 560, 2380, 8568, 27132, 77520, 203490, 497420, 1144066, 2496144, 5200300});
  }
}

