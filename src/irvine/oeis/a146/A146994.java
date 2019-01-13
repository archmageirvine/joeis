package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146994.
 * @author Sean A. Irvine
 */
public class A146994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146994() {
    super(new long[] {1, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {1, 3, 4, 7, 9, 13, 16, 22, 25});
  }
}
