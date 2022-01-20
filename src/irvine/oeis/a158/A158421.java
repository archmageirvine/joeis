package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158421 a(n) = 1024*n - 1.
 * @author Sean A. Irvine
 */
public class A158421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158421() {
    super(new long[] {-1, 2}, new long[] {1023, 2047});
  }
}
