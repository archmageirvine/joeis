package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070593 <code>a(n) = n^5 mod 7</code>.
 * @author Sean A. Irvine
 */
public class A070593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070593() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 5, 2, 3, 6});
  }
}
