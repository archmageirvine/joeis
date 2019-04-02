package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186942 a(n)=2(4^n-n*2^n)-1.
 * @author Sean A. Irvine
 */
public class A186942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186942() {
    super(new long[] {-16, 36, -28, 9}, new long[] {1, 3, 15, 79});
  }
}
