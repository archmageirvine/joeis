package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213393.
 * @author Sean A. Irvine
 */
public class A213393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213393() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 6, 24, 54, 108, 192, 300, 450});
  }
}
