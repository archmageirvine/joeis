package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079861 a(n) is the number of occurrences of 7's in the palindromic compositions of 2*n-1, or also, the number of occurrences of 8's in the palindromic compositions of 2*n.
 * @author Sean A. Irvine
 */
public class A079861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079861() {
    super(8, new long[] {-4, 4}, new long[] {10, 22});
  }
}
