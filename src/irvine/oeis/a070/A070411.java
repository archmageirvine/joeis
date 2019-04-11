package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070411 <code>a(n) = 7^n mod 26</code>.
 * @author Sean A. Irvine
 */
public class A070411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070411() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 7, 23, 5, 9, 11, 25});
  }
}
