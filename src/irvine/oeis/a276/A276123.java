package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276123 a(0) = a(1) = a(2) = 1; for n&gt;2, a(n) = ( a(n-1)+1 )*( a(n-2)+1 ) / a(n-3).
 * @author Sean A. Irvine
 */
public class A276123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276123() {
    super(new long[] {1, 0, -17, 0, 17, 0}, new long[] {1, 1, 1, 4, 10, 55});
  }
}
