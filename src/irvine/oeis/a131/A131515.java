package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131515.
 * @author Sean A. Irvine
 */
public class A131515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131515() {
    super(new long[] {1, -35, 35}, new long[] {1, 16, 545});
  }
}
