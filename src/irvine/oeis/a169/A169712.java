package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169712 The function <code>W_n(8) (see</code> Borwein et al. reference for <code>definition)</code>.
 * @author Sean A. Irvine
 */
public class A169712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169712() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 70, 639, 2716, 7885});
  }
}
