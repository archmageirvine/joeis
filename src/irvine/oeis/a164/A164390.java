package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164390.
 * @author Sean A. Irvine
 */
public class A164390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164390() {
    super(new long[] {1, 0, 1, 0, 1, 1}, new long[] {1, 2, 4, 8, 14, 25});
  }
}
