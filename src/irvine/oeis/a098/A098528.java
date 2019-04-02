package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098528 Expansion of (1+2*x^3)/(1-x-4*x^7).
 * @author Sean A. Irvine
 */
public class A098528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098528() {
    super(new long[] {4, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 3, 3, 3, 3});
  }
}
