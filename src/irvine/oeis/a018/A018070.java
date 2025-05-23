package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018070 Expansion of 1/((1-3*x)*(1-8*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A018070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018070() {
    super(new long[] {264, -145, 22}, new long[] {1, 22, 339});
  }
}
