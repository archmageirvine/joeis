package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059224 <code>a(n) = 2^(n-3)*(n + 3)*(2*n - 3)</code>.
 * @author Sean A. Irvine
 */
public class A059224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059224() {
    super(new long[] {8, -12, 6}, new long[] {18, 70, 224});
  }
}
