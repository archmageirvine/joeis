package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075561 Domination number for kings' graph K(n).
 * @author Sean A. Irvine
 */
public class A075561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075561() {
    super(1, new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 1, 1, 4, 4, 4, 9});
  }
}
