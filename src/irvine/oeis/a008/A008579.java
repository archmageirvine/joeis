package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008579.
 * @author Sean A. Irvine
 */
public class A008579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008579() {
    super(new long[] {0, 0, -1, 0, 2, 0}, new long[] {1, 4, 8, 14, 18, 22});
  }
}

