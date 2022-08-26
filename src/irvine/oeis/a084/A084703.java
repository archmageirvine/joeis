package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084703 Squares k such that 2*k+1 is also a square.
 * @author Sean A. Irvine
 */
public class A084703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084703() {
    super(new long[] {1, -35, 35}, new long[] {0, 4, 144});
  }
}
