package irvine.oeis.a265;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A265755 a(n) = a(n-1) + a(n-2) if n is even and a(n) = a(n-3) + a(n-4) if n is odd, with a(0) = a(1) = a(2) = 0 and a(3) = 1.
 * @author Sean A. Irvine
 */
public class A265755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265755() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 0, 0, 1, 1, 0});
  }
}
