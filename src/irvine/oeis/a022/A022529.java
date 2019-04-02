package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022529 Nexus numbers (n+1)^13-n^13.
 * @author Sean A. Irvine
 */
public class A022529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022529() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 8191, 1586131, 65514541, 1153594261, 11839990891L, 83828316391L, 452866803481L, 1992110014441L, 7458134171671L, 24522712143931L, 72470493235141L, 195881901213181L});
  }
}
