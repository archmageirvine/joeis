package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176260 Periodic sequence: Repeat 5, 1.
 * @author Sean A. Irvine
 */
public class A176260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176260() {
    super(new long[] {1, 0}, new long[] {5, 1});
  }
}
