package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253198.
 * @author Sean A. Irvine
 */
public class A253198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253198() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 2, 4, 5});
  }
}
