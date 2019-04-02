package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144969 Stirling numbers of second kind S(n,n-6).
 * @author Sean A. Irvine
 */
public class A144969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144969() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 1, 127, 3025, 34105, 246730, 1323652, 5715424, 20912320, 67128490, 193754990, 512060978, 1256328866});
  }
}
