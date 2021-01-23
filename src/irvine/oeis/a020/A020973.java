package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020973 Expansion of 1/((1-7*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A020973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020973() {
    super(new long[] {770, -257, 28}, new long[] {1, 28, 527});
  }
}
