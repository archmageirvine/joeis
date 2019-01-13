package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037671.
 * @author Sean A. Irvine
 */
public class A037671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037671() {
    super(new long[] {-8, 1, 0, 8}, new long[] {3, 26, 208, 1667});
  }
}
