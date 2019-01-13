package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037554.
 * @author Sean A. Irvine
 */
public class A037554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037554() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 56, 282});
  }
}
