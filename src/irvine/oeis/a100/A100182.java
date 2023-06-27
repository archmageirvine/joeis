package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100182 Structured tetragonal anti-prism numbers.
 * @author Sean A. Irvine
 */
public class A100182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100182() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 8, 28, 68});
  }
}
