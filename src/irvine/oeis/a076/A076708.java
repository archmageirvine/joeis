package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076708 Numbers n such that triangular numbers <code>T(n)</code> and <code>T(n+1)</code> sum to another triangular number (that is also a perfect <code>square)</code>.
 * @author Sean A. Irvine
 */
public class A076708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076708() {
    super(new long[] {1, -7, 7}, new long[] {0, 5, 34});
  }
}
