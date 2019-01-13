package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216540.
 * @author Sean A. Irvine
 */
public class A216540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216540() {
    super(new long[] {-13, 91, -182, 156, -65, 13}, new long[] {0, 0, -1, -8, -45, -221});
  }
}
