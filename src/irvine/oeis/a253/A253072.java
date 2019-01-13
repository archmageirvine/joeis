package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253072.
 * @author Sean A. Irvine
 */
public class A253072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253072() {
    super(new long[] {-8, 44, -24, -5, 6}, new long[] {1, 7, 21, 95, 333});
  }
}
