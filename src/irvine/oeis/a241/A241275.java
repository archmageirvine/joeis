package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241275 a(n) = 6*a(n-1) + 5*(2^(n-1)-1) for n &gt; 0, a(0) = 0.
 * @author Sean A. Irvine
 */
public class A241275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241275() {
    super(new long[] {12, -20, 9}, new long[] {0, 0, 5});
  }
}
