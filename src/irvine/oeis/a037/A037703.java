package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037703.
 * @author Sean A. Irvine
 */
public class A037703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037703() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {1, 8, 40, 202, 1011});
  }
}
