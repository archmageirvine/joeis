package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035291.
 * @author Sean A. Irvine
 */
public class A035291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035291() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 16, 88, 280});
  }
}
