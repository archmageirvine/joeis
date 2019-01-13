package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213287.
 * @author Sean A. Irvine
 */
public class A213287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213287() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 91, 869, 4895, 21562, 83728, 296268, 977026});
  }
}
