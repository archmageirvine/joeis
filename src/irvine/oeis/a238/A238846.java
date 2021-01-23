package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238846 Expansion of (1-2*x)/(1-3*x+x^2)^2.
 * @author Sean A. Irvine
 */
public class A238846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238846() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 4, 13, 40});
  }
}
