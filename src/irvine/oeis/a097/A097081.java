package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097081 Sum <code>C(n,4k)2^k, k = 0 . . n</code>.
 * @author Sean A. Irvine
 */
public class A097081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097081() {
    super(new long[] {1, 4, -6, 4}, new long[] {1, 1, 1, 1});
  }
}
