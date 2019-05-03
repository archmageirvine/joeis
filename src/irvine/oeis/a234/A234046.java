package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234046 Period <code>7</code>: repeat <code>[0, 1, -1, 0, 0, -1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A234046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234046() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {0, 1, -1, 0, 0, -1});
  }
}
