package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199115 a(n) = 5*4^n+1.
 * @author Sean A. Irvine
 */
public class A199115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199115() {
    super(new long[] {-4, 5}, new long[] {6, 21});
  }
}
