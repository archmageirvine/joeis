package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164093 9*4^n+2.
 * @author Sean A. Irvine
 */
public class A164093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164093() {
    super(1, new long[] {-4, 5}, new long[] {38, 146});
  }
}
