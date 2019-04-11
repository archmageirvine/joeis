package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152437 <code>(17^n - 1)/(2^(5 - (n</code> % <code>2)))</code>.
 * @author Sean A. Irvine
 */
public class A152437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152437() {
    super(new long[] {-289, 0, 290, 0}, new long[] {0, 1, 9, 307});
  }
}
