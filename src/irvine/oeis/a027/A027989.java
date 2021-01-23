package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027989 a(n) = self-convolution of row n of array T given by A027926.
 * @author Sean A. Irvine
 */
public class A027989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027989() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 3, 10, 33});
  }
}
