package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121512.
 * @author Sean A. Irvine
 */
public class A121512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121512() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 10, 4});
  }
}
