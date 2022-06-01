package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072256 a(n) = 10*a(n-1) - a(n-2) for n &gt; 1, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A072256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072256() {
    super(new long[] {-1, 10}, new long[] {1, 1});
  }
}
