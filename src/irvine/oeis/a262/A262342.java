package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262342 Area of Lewis Carroll's paradoxical F(2n+1) X F(2n+3) rectangle.
 * @author Sean A. Irvine
 */
public class A262342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262342() {
    super(1, new long[] {1, -8, 8}, new long[] {10, 65, 442});
  }
}
