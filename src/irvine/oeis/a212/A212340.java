package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212340.
 * @author Sean A. Irvine
 */
public class A212340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212340() {
    super(new long[] {5, 2, 1, 1}, new long[] {1, 1, 2, 5});
  }
}
