package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083590 Expansion of 1/((1-5*x)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A083590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083590() {
    super(new long[] {-5, 1, 0, 0, 0, 5}, new long[] {1, 5, 25, 125, 625, 3126});
  }
}
