package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028077 Expansion of <code>1/((1-3x)(1-6x)(1-7x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028077() {
    super(new long[] {-1386, 1017, -257, 27}, new long[] {1, 27, 472, 6822});
  }
}
