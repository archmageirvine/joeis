package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078040 Expansion of (1-x)/(1+x-2*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A078040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078040() {
    super(new long[] {-2, 2, -1}, new long[] {1, -2, 4});
  }
}
