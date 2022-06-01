package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022469 Expansion of 1/((1-x)*(1-5*x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A022469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022469() {
    super(new long[] {-360, 517, -179, 23}, new long[] {1, 23, 350, 4450});
  }
}
