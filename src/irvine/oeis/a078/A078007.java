package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078007 Expansion of (1-x)/(1-x-2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A078007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078007() {
    super(new long[] {1, 2, 1}, new long[] {1, 0, 2});
  }
}
