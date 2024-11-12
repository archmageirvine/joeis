package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016162 Expansion of 1/((1-5*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A016162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016162() {
    super(new long[] {-40, 13}, new long[] {1, 13});
  }
}
