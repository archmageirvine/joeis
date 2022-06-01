package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007909 Expansion of (1-x)/(1-2*x+x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A007909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007909() {
    super(new long[] {2, -1, 2}, new long[] {1, 1, 1});
  }
}

