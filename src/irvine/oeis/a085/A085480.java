package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085480 Expansion of 3*x*(1+2*x)/(1-3*x-3*x^2).
 * @author Sean A. Irvine
 */
public class A085480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085480() {
    super(new long[] {3, 3}, new long[] {3, 15}, 0);
  }
}
