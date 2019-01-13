package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107955.
 * @author Sean A. Irvine
 */
public class A107955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107955() {
    super(new long[] {64, -256, 432, -400, 220, -72, 13}, new long[] {191, 1471, 7551, 31871, 119231, 410303, 1327103});
  }
}
