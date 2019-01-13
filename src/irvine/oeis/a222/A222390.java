package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222390.
 * @author Sean A. Irvine
 */
public class A222390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222390() {
    super(new long[] {1, -1, -38, 38, 1}, new long[] {0, 3, 15, 132, 588});
  }
}
