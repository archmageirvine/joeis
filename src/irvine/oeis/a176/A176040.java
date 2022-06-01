package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176040 Periodic sequence: Repeat 3, 1.
 * @author Sean A. Irvine
 */
public class A176040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176040() {
    super(new long[] {1, 0}, new long[] {3, 1});
  }
}
