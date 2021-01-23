package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078042 Expansion of (1-x)/(1+x-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A078042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078042() {
    super(new long[] {-1, 1, -1}, new long[] {1, -2, 3});
  }
}
