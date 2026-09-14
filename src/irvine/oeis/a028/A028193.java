package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028193 Expansion of 1/((1-5*x)*(1-8*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A028193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028193() {
    super(new long[] {-4400, 2270, -423, 34}, new long[] {1, 34, 733, 12810});
  }
}
