package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156090.
 * @author Sean A. Irvine
 */
public class A156090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156090() {
    super(new long[] {-1, -16, 34, -16}, new long[] {0, -4, 60, -1096});
  }
}
