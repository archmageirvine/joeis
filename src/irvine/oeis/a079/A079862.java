package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079862 a(i) = the number of occurrences of 9's in the palindromic compositions of n=2*i-1 = the number of occurrences of 10's in the palindromic compositions of n=2*i.
 * @author Sean A. Irvine
 */
public class A079862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079862() {
    super(new long[] {-4, 4}, new long[] {18, 38});
  }
}
