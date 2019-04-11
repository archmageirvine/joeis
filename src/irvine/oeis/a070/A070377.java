package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070377 <code>a(n) = 5^n mod 27</code>.
 * @author Sean A. Irvine
 */
public class A070377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070377() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 25, 17, 4, 20, 19, 14, 16, 26});
  }
}
