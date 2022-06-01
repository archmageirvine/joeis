package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017828 Expansion of 1/(1-x^4-x^5-x^6).
 * @author Sean A. Irvine
 */
public class A017828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017828() {
    super(new long[] {1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1});
  }
}
