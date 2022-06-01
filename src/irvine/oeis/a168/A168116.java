package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168116 a(n) = n*(n^8+1)/2.
 * @author Sean A. Irvine
 */
public class A168116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168116() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 257, 9843, 131074, 976565, 5038851, 20176807, 67108868, 193710249});
  }
}
