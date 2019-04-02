package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100775 a(n) = 97*n + 101.
 * @author Sean A. Irvine
 */
public class A100775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100775() {
    super(new long[] {-1, 2}, new long[] {101, 198});
  }
}
