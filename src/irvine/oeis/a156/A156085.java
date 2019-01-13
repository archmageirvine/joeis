package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156085.
 * @author Sean A. Irvine
 */
public class A156085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156085() {
    super(new long[] {-1, 17, 17}, new long[] {0, 1, 17});
  }
}
