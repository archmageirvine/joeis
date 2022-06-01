package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025897 Expansion of 1/((1-x^6)(1-x^7)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A025897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025897() {
    super(new long[] {1, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 2, 1, 1, 0, 1, 1, 2});
  }
}
