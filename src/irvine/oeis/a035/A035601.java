package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035601.
 * @author Sean A. Irvine
 */
public class A035601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035601() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 2, 28, 198, 952, 3530, 10836, 28814});
  }
}
