package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129641.
 * @author Sean A. Irvine
 */
public class A129641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129641() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 200, 611, 1227, 2291, 4620, 8180});
  }
}
