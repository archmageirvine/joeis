package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156283.
 * @author Sean A. Irvine
 */
public class A156283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156283() {
    super(new long[] {-1, -1, -1, -1, -1}, new long[] {1, 2, 4, -4, -2});
  }
}
