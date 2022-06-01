package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229611 Expansion of 1/((1-x)^3*(1-11x)).
 * @author Sean A. Irvine
 */
public class A229611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229611() {
    super(new long[] {-11, 34, -36, 14}, new long[] {1, 14, 160, 1770});
  }
}
