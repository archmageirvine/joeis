package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258340.
 * @author Sean A. Irvine
 */
public class A258340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258340() {
    super(new long[] {21, -31, 11}, new long[] {1, 7, 46});
  }
}
