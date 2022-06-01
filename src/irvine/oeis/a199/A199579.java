package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199579 Average number of round trips of length n on the Laguerre graph L_4.
 * @author Sean A. Irvine
 */
public class A199579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199579() {
    super(new long[] {-24, 96, -72, 16}, new long[] {1, 4, 28, 232});
  }
}
