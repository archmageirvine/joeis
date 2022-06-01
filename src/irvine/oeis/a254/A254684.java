package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254684 Fifth partial sums of seventh powers (A001015).
 * @author Sean A. Irvine
 */
public class A254684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254684() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 133, 2842, 29274, 197400, 1001952, 4137966, 14597934, 45454773, 127861825, 330540028, 795609724, 1801339176});
  }
}
