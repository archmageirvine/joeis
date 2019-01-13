package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131569.
 * @author Sean A. Irvine
 */
public class A131569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131569() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {1, 2, 8, 24, 71, 198});
  }
}
