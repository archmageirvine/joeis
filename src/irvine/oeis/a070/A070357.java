package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070357 <code>a(n) = 3^n mod 28</code>.
 * @author Sean A. Irvine
 */
public class A070357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070357() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 3, 9, 27});
  }
}
