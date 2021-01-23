package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100132 Sum C(n-2k,2k)2^(n-3k), k=0..floor(n/4).
 * @author Sean A. Irvine
 */
public class A100132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100132() {
    super(new long[] {2, 0, -4, 4}, new long[] {1, 2, 4, 8});
  }
}
