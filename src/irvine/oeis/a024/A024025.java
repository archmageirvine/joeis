package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024025 <code>a(n) = 3^n-n^2</code>.
 * @author Sean A. Irvine
 */
public class A024025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024025() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 2, 5, 18});
  }
}
