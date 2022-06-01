package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176415 Periodic sequence: repeat 7,1.
 * @author Sean A. Irvine
 */
public class A176415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176415() {
    super(new long[] {1, 0}, new long[] {7, 1});
  }
}
