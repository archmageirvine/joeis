package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246057 a(n) = (5*10^n - 2)/3.
 * @author Sean A. Irvine
 */
public class A246057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246057() {
    super(new long[] {-10, 11}, new long[] {1, 16});
  }
}
