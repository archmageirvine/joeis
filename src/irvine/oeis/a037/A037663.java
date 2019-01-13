package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037663.
 * @author Sean A. Irvine
 */
public class A037663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037663() {
    super(new long[] {-7, 1, 0, 7}, new long[] {3, 22, 154, 1081});
  }
}
