package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078338.
 * @author Sean A. Irvine
 */
public class A078338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078338() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 3, 4, 5, 5, 4, 5, 5});
  }
}
