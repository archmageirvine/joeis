package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123007 Expansion of x*(1+x)/(1 -2*x -9*x^2).
 * @author Sean A. Irvine
 */
public class A123007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123007() {
    super(1, new long[] {9, 2}, new long[] {1, 3});
  }
}
