package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078057 Expansion of (1+x)/(1-2*x-x^2).
 * @author Sean A. Irvine
 */
public class A078057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078057() {
    super(new long[] {1, 2}, new long[] {1, 3});
  }
}
