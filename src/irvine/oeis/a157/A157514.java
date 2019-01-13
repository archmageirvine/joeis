package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157514.
 * @author Sean A. Irvine
 */
public class A157514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157514() {
    super(new long[] {1, -3, 3}, new long[] {24, 98, 222});
  }
}
