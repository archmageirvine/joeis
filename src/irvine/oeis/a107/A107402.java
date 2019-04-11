package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107402 <code>a(n)= -a(n-1) +5*a(n-2) +5*a(n-3) -a(n-4) -a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A107402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107402() {
    super(new long[] {-1, -1, 5, 5, -1}, new long[] {0, 1, 1, 2, 3});
  }
}
