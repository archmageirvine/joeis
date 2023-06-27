package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038740 T(n,n-3), array T as in A038738.
 * @author Sean A. Irvine
 */
public class A038740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038740() {
    super(3, new long[] {-1, 9, -34, 71, -90, 71, -34, 9}, new long[] {1, 9, 47, 188, 643, 1993, 5798, 16193});
  }
}
