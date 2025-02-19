package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108474 Expansion of 1/((1-2*x)*(1+4*x^2)).
 * @author Sean A. Irvine
 */
public class A108474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108474() {
    super(new long[] {8, -4, 2}, new long[] {1, 2, 0});
  }
}
