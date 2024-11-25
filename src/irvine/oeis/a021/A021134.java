package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021134 Expansion of 1/((1-x)*(1-2*x)*(1-5*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A021134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021134() {
    super(new long[] {-90, 163, -89, 17}, new long[] {1, 17, 200, 2050});
  }
}
