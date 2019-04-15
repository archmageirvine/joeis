package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074392 <code>a(n) = Lucas(n+1) + (3*(-1)^n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A074392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074392() {
    super(new long[] {-1, -1, 2, 1}, new long[] {2, 1, 5, 5});
  }
}
