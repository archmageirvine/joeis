package irvine.oeis.a044;

import irvine.oeis.LinearRecurrence;

/**
 * A044941 Number of runs of even length in base 10 representation of n.
 * @author Sean A. Irvine
 */
public class A044941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A044941() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
