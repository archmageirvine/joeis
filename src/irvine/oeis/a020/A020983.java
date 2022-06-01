package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020983 Expansion of 1/((1-9*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020983() {
    super(new long[] {1080, -318, 31}, new long[] {1, 31, 643});
  }
}
