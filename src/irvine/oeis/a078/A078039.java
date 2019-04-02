package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078039 Expansion of (1-x)/(1+x-2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A078039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078039() {
    super(new long[] {-1, 2, -1}, new long[] {1, -2, 4});
  }
}
