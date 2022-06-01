package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020699 Expansion of (1-3*x)/(1-5*x).
 * @author Sean A. Irvine
 */
public class A020699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020699() {
    super(new long[] {5}, new long[] {2}, 1);
  }
}
