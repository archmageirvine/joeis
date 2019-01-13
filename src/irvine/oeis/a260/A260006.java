package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260006.
 * @author Sean A. Irvine
 */
public class A260006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260006() {
    super(new long[] {-4, 12, -13, 6}, new long[] {0, 3, 12, 35});
  }
}
