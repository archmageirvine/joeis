package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028013 Expansion of 1/((1-2*x)*(1-7*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A028013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028013() {
    super(new long[] {-1680, 1388, -332, 31}, new long[] {1, 31, 629, 10595});
  }
}
