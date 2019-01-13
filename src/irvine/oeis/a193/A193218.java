package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193218.
 * @author Sean A. Irvine
 */
public class A193218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193218() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 21, 95, 259});
  }
}
