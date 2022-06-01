package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137879 Numbers k such that k^2 is a 17-gonal number.
 * @author Sean A. Irvine
 */
public class A137879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137879() {
    super(new long[] {-1, 0, 482, 0}, new long[] {1, 133, 615, 64107});
  }
}
