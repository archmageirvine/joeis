package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256871 <code>a(n) = 2^(n-1)*(2^n+11)</code>.
 * @author Sean A. Irvine
 */
public class A256871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256871() {
    super(new long[] {-8, 6}, new long[] {6, 13});
  }
}
