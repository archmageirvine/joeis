package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027989 <code>a(n) = self-convolution</code> of row n of array T given by <code>A027926</code>.
 * @author Sean A. Irvine
 */
public class A027989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027989() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 3, 10, 33});
  }
}
