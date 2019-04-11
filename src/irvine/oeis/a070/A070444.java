package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070444 <code>a(n) = n^2 mod 22</code>.
 * @author Sean A. Irvine
 */
public class A070444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070444() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 16, 3, 14, 5, 20, 15, 12, 11, 12, 15, 20, 5, 14, 3, 16, 9, 4, 1});
  }
}
