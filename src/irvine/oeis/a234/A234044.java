package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234044 Period <code>7</code>: repeat <code>[2, -2, 1, 0, 0, 1, -2]</code>.
 * @author Sean A. Irvine
 */
public class A234044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234044() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {2, -2, 1, 0, 0, 1});
  }
}
