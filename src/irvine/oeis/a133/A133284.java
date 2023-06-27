package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133284 Indices of the 12-gonal numbers which are also centered 12-gonal number or numbers X such that 30*X^2-24*X+3 is a square.
 * @author Sean A. Irvine
 */
public class A133284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133284() {
    super(1, new long[] {1, -23, 23}, new long[] {1, 13, 277});
  }
}
