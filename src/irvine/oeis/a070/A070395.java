package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070395 <code>a(n) = 6^n mod 19</code>.
 * @author Sean A. Irvine
 */
public class A070395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070395() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 17, 7, 4, 5, 11, 9, 16});
  }
}
