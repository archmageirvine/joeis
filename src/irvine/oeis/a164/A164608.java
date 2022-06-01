package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164608 Expansion of (1+4*x)/(1-8*x+8*x^2).
 * @author Sean A. Irvine
 */
public class A164608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164608() {
    super(new long[] {-8, 8}, new long[] {1, 12});
  }
}
