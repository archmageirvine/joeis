package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041459 Denominators of continued fraction convergents to sqrt(245).
 * @author Sean A. Irvine
 */
public class A041459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041459() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 103682, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 23, 141, 1010, 1151, 2161, 3312, 101521, 104833, 206354, 311187, 2384663, 14619165, 104718818, 119337983, 224056801, 343394784});
  }
}
