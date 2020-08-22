package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020978 Expansion of 1/((1-8*x)*(1-9*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020978() {
    super(new long[] {864, -276, 29}, new long[] {1, 29, 565});
  }
}
