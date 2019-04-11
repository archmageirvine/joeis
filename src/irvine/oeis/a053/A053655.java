package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053655 <code>a(n) = (10^n-1)*(10^(2*n-1)-1)/81</code>.
 * @author Sean A. Irvine
 */
public class A053655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053655() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {1, 1221, 1233321, 1234444321});
  }
}
