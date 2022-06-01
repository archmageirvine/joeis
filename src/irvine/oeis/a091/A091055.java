package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091055 Expansion of x*(1-2*x)/((1-x)*(1+2*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A091055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091055() {
    super(new long[] {-12, 8, 5}, new long[] {0, 1, 3});
  }
}
