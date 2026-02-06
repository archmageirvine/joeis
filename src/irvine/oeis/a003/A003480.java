package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003480 a(0) = 1, a(1) = 2, a(2) = 7, for n &gt; 2, a(n) = 4*a(n-1) - 2*a(n-2).
 * @author Sean A. Irvine
 */
public class A003480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003480() {
    super(new long[] {0, -2, 4}, new long[] {1, 2, 7});
  }
}

