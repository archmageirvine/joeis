package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049654.
 * @author Sean A. Irvine
 */
public class A049654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049654() {
    super(new long[] {1, -48, 48}, new long[] {0, 11, 532});
  }
}
