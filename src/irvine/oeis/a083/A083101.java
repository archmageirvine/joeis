package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083101 a(n) = 2*a(n-1) + 10*a(n-2).
 * @author Sean A. Irvine
 */
public class A083101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083101() {
    super(new long[] {10, 2}, new long[] {1, 12});
  }
}
