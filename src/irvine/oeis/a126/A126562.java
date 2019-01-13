package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126562.
 * @author Sean A. Irvine
 */
public class A126562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126562() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 32, 81});
  }
}
