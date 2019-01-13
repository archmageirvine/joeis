package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194350.
 * @author Sean A. Irvine
 */
public class A194350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194350() {
    super(new long[] {10, 0, 0, 0}, new long[] {1, 1, 2, 5});
  }
}
