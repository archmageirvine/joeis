package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037799.
 * @author Sean A. Irvine
 */
public class A037799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037799() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {3, 32, 321, 3210, 32103});
  }
}
