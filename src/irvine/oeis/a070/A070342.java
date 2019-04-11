package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070342 <code>a(n) = 3^n mod 19</code>.
 * @author Sean A. Irvine
 */
public class A070342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070342() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 9, 8, 5, 15, 7, 2, 6, 18});
  }
}
