package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100137 Sum C(n-3k,3k)2^(n-6k), k=0..floor(n/6).
 * @author Sean A. Irvine
 */
public class A100137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100137() {
    super(new long[] {1, 0, 0, 8, -12, 6}, new long[] {1, 2, 4, 8, 16, 32});
  }
}
