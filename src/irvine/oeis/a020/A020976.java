package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020976 Expansion of 1/((1-8*x)*(1-9*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A020976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020976() {
    super(new long[] {720, -242, 27}, new long[] {1, 27, 487});
  }
}
