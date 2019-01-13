package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121798.
 * @author Sean A. Irvine
 */
public class A121798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121798() {
    super(new long[] {6, -56, 63, 120, -57, -44, 13, 4}, new long[] {0, 28, 408, 1502, 7821, 31911, 145162, 616196});
  }
}
