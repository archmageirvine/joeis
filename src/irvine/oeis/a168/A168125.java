package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168125 a(n) = n^2*(n^7+1)/2.
 * @author Sean A. Irvine
 */
public class A168125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168125() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 258, 9846, 131080, 976575, 5038866, 20176828, 67108896, 193710285});
  }
}
