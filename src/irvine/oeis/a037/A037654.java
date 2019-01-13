package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037654.
 * @author Sean A. Irvine
 */
public class A037654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037654() {
    super(new long[] {-5, 1, 0, 5}, new long[] {3, 15, 77, 388});
  }
}
