package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177787.
 * @author Sean A. Irvine
 */
public class A177787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177787() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 5, 10, 18});
  }
}
