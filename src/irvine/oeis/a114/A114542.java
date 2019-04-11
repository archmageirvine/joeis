package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114542 Expansion of <code>-x*(x+1)/(9389*x^3 + 4691*x^2 - 1)</code>.
 * @author Sean A. Irvine
 */
public class A114542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114542() {
    super(new long[] {9389, 4691, 0}, new long[] {0, 1, 1});
  }
}
