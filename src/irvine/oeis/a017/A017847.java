package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017847 Expansion of 1/(1-x^6-x^7).
 * @author Sean A. Irvine
 */
public class A017847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017847() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1});
  }
}
