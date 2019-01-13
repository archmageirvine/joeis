package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145030.
 * @author Sean A. Irvine
 */
public class A145030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145030() {
    super(new long[] {1, 1, 1, 1, 1, 1}, new long[] {0, 1, 2, 3, 4, 5});
  }
}
