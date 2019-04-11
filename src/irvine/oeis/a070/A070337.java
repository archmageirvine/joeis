package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070337 <code>a(n) = 2^n mod 27</code>.
 * @author Sean A. Irvine
 */
public class A070337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070337() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 5, 10, 20, 13, 26});
  }
}
