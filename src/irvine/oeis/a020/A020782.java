package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020782 Expansion of g.f. 1/((1-7*x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A020782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020782() {
    super(new long[] {504, -191, 24}, new long[] {1, 24, 385});
  }
}
