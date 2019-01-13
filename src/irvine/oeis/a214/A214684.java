package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214684.
 * @author Sean A. Irvine
 */
public class A214684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214684() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 1, 4});
  }
}
