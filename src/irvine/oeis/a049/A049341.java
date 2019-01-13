package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049341.
 * @author Sean A. Irvine
 */
public class A049341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049341() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 6, 9, 6, 6, 3, 9, 3});
  }
}
