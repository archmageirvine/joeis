package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052787 A simple grammar. Product of 5 consecutive integers.
 * @author Sean A. Irvine
 */
public class A052787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052787() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 0, 0, 0, 120});
  }
}
