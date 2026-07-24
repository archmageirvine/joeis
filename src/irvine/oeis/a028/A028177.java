package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028177 Expansion of 1/((1-5*x)*(1-6*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A028177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028177() {
    super(new long[] {-3300, 1840, -371, 32}, new long[] {1, 32, 653, 10864});
  }
}
