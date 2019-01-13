package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164478.
 * @author Sean A. Irvine
 */
public class A164478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164478() {
    super(new long[] {-1, 1, -1, 1, -1, 2}, new long[] {13, 20, 31, 49, 78, 123});
  }
}
