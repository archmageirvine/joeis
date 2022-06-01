package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270445 Expansion of 2*x*(1+4*x) / (1-12*x+16*x^2).
 * @author Sean A. Irvine
 */
public class A270445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270445() {
    super(new long[] {-16, 12}, new long[] {2, 32});
  }
}
