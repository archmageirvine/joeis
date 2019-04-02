package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182228 a(n) = 3*a(n-2) - a(n-1) for n &gt; 1, a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A182228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182228() {
    super(new long[] {3, -1}, new long[] {0, 1});
  }
}
