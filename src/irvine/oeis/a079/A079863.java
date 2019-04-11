package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079863 <code>a(n)</code> is the number of occurrences of 11s in the palindromic compositions of m=2*n-1 = the number of occurrences of 12s in the palindromic compositions of m=2*n.
 * @author Sean A. Irvine
 */
public class A079863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079863() {
    super(new long[] {-4, 4}, new long[] {34, 70});
  }
}
