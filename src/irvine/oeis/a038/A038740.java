package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038740 <code>T(n,n-3)</code>, array T as in A038738.
 * @author Sean A. Irvine
 */
public class A038740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038740() {
    super(new long[] {-1, 9, -34, 71, -90, 71, -34, 9}, new long[] {1, 9, 47, 188, 643, 1993, 5798, 16193});
  }
}
