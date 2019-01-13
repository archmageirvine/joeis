package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107851.
 * @author Sean A. Irvine
 */
public class A107851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107851() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {0, 1, 1, 4, 4, 5, 9});
  }
}
