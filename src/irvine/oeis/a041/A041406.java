package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041406 Numerators of continued fraction convergents to sqrt(218).
 * @author Sean A. Irvine
 */
public class A041406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041406() {
    super(new long[] {1, 0, 0, 0, 0, 502, 0, 0, 0, 0}, new long[] {14, 15, 59, 192, 251, 7220, 7471, 29633, 96370, 126003});
  }
}
