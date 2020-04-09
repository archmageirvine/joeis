package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079862 <code>a(i) =</code> the number of occurrences of <code>9</code>'s in the palindromic compositions of <code>n=2*i-1 =</code> the number of occurrences of <code>10</code>'s in the palindromic compositions of <code>n=2*i</code>.
 * @author Sean A. Irvine
 */
public class A079862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079862() {
    super(new long[] {-4, 4}, new long[] {18, 38});
  }
}
