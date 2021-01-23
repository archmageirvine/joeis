package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168371 a(n) = n^5*(n^3 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168371() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 144, 3402, 33280, 196875, 843696, 2890804, 8404992});
  }
}
