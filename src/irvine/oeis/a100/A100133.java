package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100133 Sum <code>C(n-2k,2k)3^k*2^(n-4k), k=0..floor(n/4)</code>.
 * @author Sean A. Irvine
 */
public class A100133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100133() {
    super(new long[] {3, 0, -4, 4}, new long[] {1, 2, 4, 8});
  }
}
