package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157092.
 * @author Sean A. Irvine
 */
public class A157092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157092() {
    super(new long[] {1, -19, 19}, new long[] {0, 36, 680});
  }
}
