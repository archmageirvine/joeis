package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014291.
 * @author Sean A. Irvine
 */
public class A014291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014291() {
    super(new long[] {-1, 0, -1, 2}, new long[] {1, -1, -1, -1});
  }
}

