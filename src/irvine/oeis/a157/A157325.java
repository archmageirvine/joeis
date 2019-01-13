package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157325.
 * @author Sean A. Irvine
 */
public class A157325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157325() {
    super(new long[] {-1, 2}, new long[] {1752, 3480});
  }
}
