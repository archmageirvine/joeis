package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042749.
 * @author Sean A. Irvine
 */
public class A042749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042749() {
    super(new long[] {-1, 0, 722, 0}, new long[] {1, 12, 721, 8664});
  }
}
