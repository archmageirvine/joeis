package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194952.
 * @author Sean A. Irvine
 */
public class A194952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194952() {
    super(new long[] {-24, 20, 26, -25, -1, 5}, new long[] {48, 126, 390, 1014, 2982, 8094});
  }
}
