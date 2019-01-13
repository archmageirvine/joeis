package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078617.
 * @author Sean A. Irvine
 */
public class A078617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078617() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {1, 2, 4, 7, 11, 15, 20, 25});
  }
}
