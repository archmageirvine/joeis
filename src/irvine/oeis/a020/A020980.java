package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020980 Expansion of 1/((1-8*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020980() {
    super(new long[] {960, -296, 30}, new long[] {1, 30, 604});
  }
}
