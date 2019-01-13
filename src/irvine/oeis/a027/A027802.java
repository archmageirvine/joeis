package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027802.
 * @author Sean A. Irvine
 */
public class A027802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027802() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {15, 140, 700, 2520, 7350, 18480, 41580, 85800});
  }
}
