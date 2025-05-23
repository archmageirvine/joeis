package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021092 Expansion of 1/((1-x)*(1-2*x)*(1-4*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A021092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021092() {
    super(new long[] {-80, 148, -84, 17}, new long[] {1, 17, 205, 2205});
  }
}
