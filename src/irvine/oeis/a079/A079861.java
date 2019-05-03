package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079861 <code>a(n)</code> is the number of occurrences of <code>7s</code> in the palindromic compositions of <code>2*n-1</code>, or also, the number of occurrences of <code>8s</code> in the palindromic compositions of <code>2*n</code>.
 * @author Sean A. Irvine
 */
public class A079861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079861() {
    super(new long[] {-4, 4}, new long[] {10, 22});
  }
}
