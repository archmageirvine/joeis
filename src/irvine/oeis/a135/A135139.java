package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135139 a(n) = 5*a(n-2) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A135139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135139() {
    super(new long[] {2, 5, 0}, new long[] {1, 2, 4});
  }
}
