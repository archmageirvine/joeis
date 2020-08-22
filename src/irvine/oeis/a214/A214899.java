package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214899 a(n) = a(n-1) + a(n-2) + a(n-3) with a(0)=2, a(1)=1, a(2)=2.
 * @author Sean A. Irvine
 */
public class A214899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214899() {
    super(new long[] {1, 1, 1}, new long[] {2, 1, 2});
  }
}
