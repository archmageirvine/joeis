package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165355.
 * @author Sean A. Irvine
 */
public class A165355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165355() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 7, 5});
  }
}
