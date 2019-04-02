package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019623 Expansion of 1/((1-4*x)*(1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A019623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019623() {
    super(new long[] {308, -149, 22}, new long[] {1, 22, 335});
  }
}
