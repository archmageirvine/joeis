package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109241 Expansion of 1/((1-10*x)*(1-100*x)).
 * @author Sean A. Irvine
 */
public class A109241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109241() {
    super(new long[] {-1000, 110}, new long[] {1, 110});
  }
}
