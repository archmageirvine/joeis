package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037502.
 * @author Sean A. Irvine
 */
public class A037502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037502() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 9, 83, 748});
  }
}
