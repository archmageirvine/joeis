package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194960 <code>a(n) = floor((n+2)/3) + ((n-1) mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A194960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194960() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 2});
  }
}
