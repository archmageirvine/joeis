package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090278.
 * @author Sean A. Irvine
 */
public class A090278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090278() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 1}, new long[] {2, 1, 4, 2, 3, 4, 1, 3, 3, 1, 2, 3, 4, 2, 1, 4, 4, 1, 3});
  }
}
