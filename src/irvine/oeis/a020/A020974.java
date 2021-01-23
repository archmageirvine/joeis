package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020974 Expansion of 1/((1-7*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020974() {
    super(new long[] {840, -274, 29}, new long[] {1, 29, 567});
  }
}
