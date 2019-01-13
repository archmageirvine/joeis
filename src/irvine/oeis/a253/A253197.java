package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253197.
 * @author Sean A. Irvine
 */
public class A253197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253197() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 1, 3, 4, 9});
  }
}
