package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070374 a(n) = 5^n mod 21.
 * @author Sean A. Irvine
 */
public class A070374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070374() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 5, 4, 20});
  }
}
