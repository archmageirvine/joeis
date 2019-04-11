package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275195 Sum of n-th powers of the roots of <code>x^3 - 7*x^2 - 49*x - 49</code>.
 * @author Sean A. Irvine
 */
public class A275195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275195() {
    super(new long[] {49, 49, 7}, new long[] {3, 7, 147});
  }
}
