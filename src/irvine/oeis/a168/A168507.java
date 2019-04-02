package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168507 a(n) = n^5*(n^10 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168507() {
    super(new long[] {-1, 16, -120, 560, -1820, 4368, -8008, 11440, -12870, 11440, -8008, 4368, -1820, 560, -120, 16}, new long[] {0, 1, 16400, 7174575, 536871424, 15258790625L, 235092496176L, 2373780763375L, 17592186060800L, 102945566076849L, 500000000050000L, 2088624084788351L, 7703510787417600L, 25592946507231025L, 77784047779175024L, 218946945190809375L});
  }
}
