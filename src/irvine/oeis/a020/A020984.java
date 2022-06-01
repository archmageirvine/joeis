package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020984 Expansion of 1/((1-9*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020984() {
    super(new long[] {1188, -339, 32}, new long[] {1, 32, 685});
  }
}
