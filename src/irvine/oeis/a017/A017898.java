package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017898 Expansion of <code>(1-x)/(1-x-x^4)</code>.
 * @author Sean A. Irvine
 */
public class A017898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017898() {
    super(new long[] {1, 0, 0, 1}, new long[] {1, 0, 0, 0});
  }
}
