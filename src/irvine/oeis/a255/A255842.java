package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255842.
 * @author Sean A. Irvine
 */
public class A255842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255842() {
    super(new long[] {1, -3, 3}, new long[] {12, 14, 20});
  }
}
