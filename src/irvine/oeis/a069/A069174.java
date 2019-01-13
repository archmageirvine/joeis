package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069174.
 * @author Sean A. Irvine
 */
public class A069174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069174() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 70});
  }
}
