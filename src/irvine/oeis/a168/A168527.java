package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168527 a(n) = n^6*(n^2 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168527() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 160, 3645, 34816, 203125, 863136, 2941225, 8519680});
  }
}
