package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037625.
 * @author Sean A. Irvine
 */
public class A037625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037625() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 11, 44, 178});
  }
}
