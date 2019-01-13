package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094794.
 * @author Sean A. Irvine
 */
public class A094794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094794() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {44, 309, 1214, 3539, 8544, 18089});
  }
}
