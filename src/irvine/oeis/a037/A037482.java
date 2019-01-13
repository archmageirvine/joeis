package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037482.
 * @author Sean A. Irvine
 */
public class A037482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037482() {
    super(new long[] {-5, 1, 5}, new long[] {1, 7, 36});
  }
}
