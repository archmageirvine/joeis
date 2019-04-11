package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059153 <code>a(n) = 2^(n+2)*(2^(n+1)-1)</code>.
 * @author Sean A. Irvine
 */
public class A059153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059153() {
    super(new long[] {-8, 6}, new long[] {4, 24});
  }
}
