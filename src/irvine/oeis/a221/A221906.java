package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221906 4^n + 4*n.
 * @author Sean A. Irvine
 */
public class A221906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221906() {
    super(new long[] {4, -9, 6}, new long[] {1, 8, 24});
  }
}
