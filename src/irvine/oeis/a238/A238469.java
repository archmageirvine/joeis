package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238469 Period 7: repeat [0, 1, 0, 0, 0, 0, -1].
 * @author Sean A. Irvine
 */
public class A238469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238469() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {0, 1, 0, 0, 0, 0});
  }
}
