package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203571 Period length <code>10: [0, 1, 2, 3, 4, 0, 4, 3, 2, 1]</code> repeated.
 * @author Sean A. Irvine
 */
public class A203571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203571() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 0, 4, 3, 2, 1});
  }
}
