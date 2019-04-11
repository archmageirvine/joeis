package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070472 <code>a(n) = n^3 mod 7</code>.
 * @author Sean A. Irvine
 */
public class A070472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070472() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 6, 1, 6, 6});
  }
}
